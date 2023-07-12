package Entities;

import java.awt.image.BufferedImage;
import java.util.Date;

public class Accounts {

    private String numberPhone, name, surname, dateCreateAccount;
    private BufferedImage imageAvatar;
    private long accountID;
    static long countAccounts = 0;
    static Date date = new Date();

    public Accounts(String numberPhone, String name, String surname, BufferedImage imageAvatar){
        this.numberPhone = numberPhone;
        this.name = name;
        this.surname = surname;
        this.imageAvatar = imageAvatar;
        countAccounts += 1;
        this.accountID = countAccounts;
        dateCreateAccount = date.toString();
    }

    public void editNumberPhone(String numberPhone){
        this.numberPhone = numberPhone;
    }

    public void editName(String name){
        this.name = name;
    }

    public void editSurname(String surname){
        this.surname = surname;
    }

    public void editImageAvatar(BufferedImage imageAvatar){
        this.imageAvatar = imageAvatar;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public BufferedImage getImageAvatar(){
        return imageAvatar;
    }

    public long getID() {
        return accountID;
    }

    public String getDateCreateAccount(){
        return dateCreateAccount;
    }
}
