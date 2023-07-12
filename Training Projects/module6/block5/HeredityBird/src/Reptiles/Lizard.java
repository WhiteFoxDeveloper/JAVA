package Reptiles;

public class Lizard
        extends Reptile
{

    public Lizard(){
        weight = (int) Math.round(25 + 275 * Math.random());
    }

    public void voice() {
        System.out.println("Ящерица Кир" + "\nВес: " + editUnit());
    }

    public void eat() {
        catchWorm();
        ingest();
        digest();
    }

    public void move() {

    }

    //=========================

    public void catchWorm(){

    }
}
