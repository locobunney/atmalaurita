/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew_2
 */

import java.util.Date;
public class Transaction {
    /**
     * size of transaction
     */
    private double amount;
    /**
     * time of transaction
     */
    private Date timestamp;
    /**
     * optional user note with transaction
     */
    private String memo;
    /**
     * account that initiates transaction
     */
    private Account inAccount;
    /**
     * transaction constructor
     * @param amount
     * @param inAccount 
     */
    public void Transaction(double amount, Account inAccount){
        this.amount = amount;
        this.inAccount = inAccount;
        this.timestamp = new Date();
        this.memo = "";
    }
    /**
     * transaction constructor
     * @param amount
     * @param memo
     * @param inAccount 
     */
    public void Transaction(double amount, String memo, Account inAccount){
        Transaction(amount, inAccount);
        this.memo = memo;
    }
}
