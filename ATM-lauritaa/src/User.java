/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew_2
 */
import java.security.MessageDigest;
import java.util.ArrayList;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {
    /**
     * user's first name
     */
    private String firstName;
    /**
     * user's last name
     */
    private String lastName;
    /**
     * user's universal unique ID
     */
    private String uuid;
    /**
     * Java's MD5 encryption to store pin numbers
     */
    private byte pinHash[];
    private ArrayList<Account> accounts;
    /**
     * 
     * @param firstName
     * @param lastName
     * @param pin
     * @param theBank 
     */
    public User(String firstName, String lastName, String pin, Bank theBank){
            this.firstName=firstName;
            this.lastName=lastName;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException ex) {
            System.err.println("caught NoSuchAlgorithimException");
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            //kill
            System.exit(1);
        }
        //ask bank to generate an ID number
        this.uuid = theBank.getNewUserUUID();
        //alert system of new user
        System.out.printf("New user %s, %s with ID %s created. \n", lastName, firstName, this.uuid);
    }
    /**
     * 
     * @param anAcct 
     */
    public void addAccount(Account anAcct){
        this.accounts.add(anAcct);
    }
    /**
     * Accessor method for uuid
     * @return 
     */
    public String getUUID(){
        return this.uuid;
    }
}
    

