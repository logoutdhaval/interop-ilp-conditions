package com.ilp.conditions.intf;

import com.ilp.conditions.models.pdp.*;

import java.io.IOException;

public interface IlpConditionHandler {

    /**
     * Generate ILPPacket that is used to generate fulfillment and condition
     * @param ilpAddress ILPAddress of the payee account
     * @param amount amount that the payee will be receiving
     * @param transaction Serialized output of Transaction Object
     * @return Binary Encoded String that internally stores ilpAddress and amount as headers and transaction object as data
     */
    public String getILPPacket(String ilpAddress, long amount, byte[] transaction) throws IOException;

    /**
     * Generate ILPPacket that is used to generate fulfillment and condition
     * @param ilpAddress ILPAddress of the payee account
     * @param amount amount that the payee will be receiving
     * @param transaction Transaction Object
     * @return Binary Encoded String that internally stores ilpAddress and amount as headers and transaction object as data
     */
    public String getILPPacket(String ilpAddress, long amount, Transaction transaction) throws IOException;


    public Transaction getTransactionFromIlpPacket(String ilpPacket) throws IOException;

    /**
     * A Fulfillment that is generated by using ilpPacket and secret as parameters
     * @param ilpPacket An ilp packet that is generated based on payee account, amount and Transaction details
     * @param secret secret used while applying the SHA 256 HMAC against the ilp packet
     * @return Binary Encoded Fulfilllment that Payee FSP sends to the ledger for validation against the condition from the incoming transfer
     */
    public String generateFulfillment(String ilpPacket, byte[] secret);

    /**
     * A condition that is generated during setup process and is sent across in the subsequent hop-by-hop transfers
     * @param ilpPacket An ilp packet that is generated based on payee account, amount and Transaction details
     * @param secret secret used while applying the SHA 256 HMAC against the ilp packet
     * @return condition that Payee FSP generates and returned as part of quote and is sent back in Transfers
     */
    public String generateCondition(String ilpPacket, byte[] secret);

    /**
     * Ledger validates Payee FSP generated Fulfillment against the condition from incoming transfer and only upon matching proceeds further in fulfilling the transaction
     * @param fulfillment Binary encoded IlpFulfillment that Payee FSP sends to the ledger for validation against the condition from the incoming transfer
     * @param condition Binary encoded condition that is part of incoming transfer
     * @return boolean true/false depending on the matching result between fulfillment and condition
     */
    public boolean validateFulfillmentAgainstCondition(String fulfillment, String condition);

}
