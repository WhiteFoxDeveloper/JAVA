package Entities;

import java.util.Date;

public class Messages {

    private String message, dateMessage;
    private long accountID;
    private boolean deleted = false;
    static Date date = new Date();

    public Messages(String message, long accountID){
        this.message = message;
        this.accountID = accountID;
        dateMessage = date.toString();
    }

    public long getAccountID(){
        return accountID;
    }

    public String getDate(){
        return dateMessage;
    }

    public boolean isOwner(Accounts account){
        return (accountID == account.getID());
    }

    public void delete(){
        deleted = true;
    }

    public boolean isDeleted(){
        return deleted;
    }

}
