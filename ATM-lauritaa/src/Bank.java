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
import java.util.Random;
public class Bank {
    /**
     * name of bank
     */
    private String name;
    /**
     * array list of users
     */
    private ArrayList<User> users;
    /**
     * array list of accounts
     */
    private ArrayList<Account> accounts;
    public String getNewUserUUID(){
        String uuid;
        Random rng = new Random();
        int len = 6;
        boolean nonUnique;
        do {
            uuid = "";
            for (int c = 0; c<len;c++){
                uuid += ((Integer)rng.nextInt(10)).toString();
            }
            nonUnique = false;
            for(User u : this.users){
                if (uuid.compareTo(u.getUUID())==0){
                    nonUnique= true;
                    break;
                }
            }
        } while(nonUnique);
        return uuid;
    }
    public String getNewAccountUUID(){
        String uuid;
        Random rng = new Random();
        int len = 10;
        boolean nonUnique;
        do {
            uuid = "";
            for (int c = 0; c<len;c++){
                uuid += ((Integer)rng.nextInt(10)).toString();
            }
            nonUnique = false;
            for(Account a : this.accounts){
                if (uuid.compareTo(a.getUUID())==0){
                    nonUnique= true;
                    break;
                }
            }
        } while(nonUnique);
        return uuid;
    }
    /**
     * 
     * @param anAcct 
     */
    public void addAccount(Account anAcct){
        this.accounts.add(anAcct);
    }
    
}
