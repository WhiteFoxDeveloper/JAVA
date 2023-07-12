package Pisces;

public class Salmon
        extends Fish
{

    public Salmon(){
        weight = (int) Math.round(2000 + 8000 * Math.random());
    }

    public void voice() {
        System.out.println("Лосось" + "\nВес: " + editUnit());
    }

    public void eat() {
        catchSmallFish();
        bite();
        ingest();
        digest();
    }

    public void move() {

    }

    //=======================

    public void catchSmallFish(){

    }
}
