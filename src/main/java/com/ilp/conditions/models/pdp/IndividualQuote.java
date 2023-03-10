/*
 * PDP FSP API (Implementation Friendly Version)
 * DRAFT FOR INTERNAL REVIEW ONLY - Based on API Definition.docx updated on 2017-07-06 - Implementation friendly version. [Changes from pervious version (2.7) - maxLength changed to 48 from 32 for IlpCondition and IlpFulfilment Types.]
 *
 * OpenAPI spec version: 2.8
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ilp.conditions.models.pdp;

import java.util.Objects;

/**
 * Data model for the complex type IndividualQuote.
 */
public class IndividualQuote {

  private String quoteId = null;

  private String transactionId = null;

  private Party payee = null;

  private String amountType = null;

  private Money amount = null;

  private Money fees = null;

  private TransactionType transactionType = null;

  private String note = null;

  private ExtensionList extensionList = null;

  public IndividualQuote quoteId(String quoteId) {
    this.quoteId = quoteId;
    return this;
  }

   /**
   * Identifies quote message.
   * @return quoteId
  **/
  public String getQuoteId() {
    return quoteId;
  }

  public void setQuoteId(String quoteId) {
    this.quoteId = quoteId;
  }

  public IndividualQuote transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Identifies transaction message.
   * @return transactionId
  **/
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public IndividualQuote payee(Party payee) {
    this.payee = payee;
    return this;
  }

   /**
   * Get payee
   * @return payee
  **/
  public Party getPayee() {
    return payee;
  }

  public void setPayee(Party payee) {
    this.payee = payee;
  }

  public IndividualQuote amountType(String amountType) {
    this.amountType = amountType;
    return this;
  }

   /**
   * SEND for sendAmount, RECEIVE for receiveAmount.
   * @return amountType
  **/
  public String getAmountType() {
    return amountType;
  }

  public void setAmountType(String amountType) {
    this.amountType = amountType;
  }

  public IndividualQuote amount(Money amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  public Money getAmount() {
    return amount;
  }

  public void setAmount(Money amount) {
    this.amount = amount;
  }

  public IndividualQuote fees(Money fees) {
    this.fees = fees;
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  public Money getFees() {
    return fees;
  }

  public void setFees(Money fees) {
    this.fees = fees;
  }

  public IndividualQuote transactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  public TransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
  }

  public IndividualQuote note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Memo that will be attached to the transaction.
   * @return note
  **/
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public IndividualQuote extensionList(ExtensionList extensionList) {
    this.extensionList = extensionList;
    return this;
  }

   /**
   * Get extensionList
   * @return extensionList
  **/
  public ExtensionList getExtensionList() {
    return extensionList;
  }

  public void setExtensionList(ExtensionList extensionList) {
    this.extensionList = extensionList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualQuote individualQuote = (IndividualQuote) o;
    return Objects.equals(this.quoteId, individualQuote.quoteId) &&
        Objects.equals(this.transactionId, individualQuote.transactionId) &&
        Objects.equals(this.payee, individualQuote.payee) &&
        Objects.equals(this.amountType, individualQuote.amountType) &&
        Objects.equals(this.amount, individualQuote.amount) &&
        Objects.equals(this.fees, individualQuote.fees) &&
        Objects.equals(this.transactionType, individualQuote.transactionType) &&
        Objects.equals(this.note, individualQuote.note) &&
        Objects.equals(this.extensionList, individualQuote.extensionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteId, transactionId, payee, amountType, amount, fees, transactionType, note, extensionList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualQuote {\n");
    
    sb.append("    quoteId: ").append(toIndentedString(quoteId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    extensionList: ").append(toIndentedString(extensionList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
