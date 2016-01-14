/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew_2
 */
import java.util.ArrayList;
public class Account {
    /**
     * The type of account
     */
    
    private String name;
    /**
     * unique universal ID
     */
    private String uuid;
    /**
     * user associated with the account
     */
    private User holder;
    /**
     * list of all transactions
     */
    private ArrayList<Transaction> transactions;
    
    public Account (String name, User holder, Bank theBank){
        this.name = name;
        this.holder = holder;
        this.uuid = theBank.getNewAccountUUID();
        this.transactions = new ArrayList<>();
    }
    public String getUUID(){
        return uuid;
    }
}
