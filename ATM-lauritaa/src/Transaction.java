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
    private Date timeStamp;
    /**
     * optional user note with transaction
     */
    private String memo;
    /**
     * account that initiates transaction
     */
    private Account inAccount;
}
