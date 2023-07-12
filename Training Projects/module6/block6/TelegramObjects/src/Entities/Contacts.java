package Entities;

public class Contacts {

    private Accounts account;
    private boolean deleted = false;
    private String name;
    static int countContacts = 0;

    public Contacts(Accounts account){
        this.account = account;
        name = account.getName() + " " + account.getSurname();
        countContacts += 1;
    }


    public Accounts getAccount(){
        return account;
    }

    public String getName(){
        return name;
    }

    public void editName(String name){
        this.name = name;
    }

    public void delete(){
        deleted = true;
        countContacts -= 1;
    }

    public boolean isDeleted(){
        return deleted;
    }

    public int length(){
        return countContacts;
    }

}
