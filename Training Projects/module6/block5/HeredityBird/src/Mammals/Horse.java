package Mammals;

public class Horse
        extends Mammal
{

    public Horse(){
        weight = (int) Math.round(50000 + 250000 * Math.random());
    }

    public void voice() {
        System.out.println("Лошадь Бррр" + "\nВес: " + editUnit());
    }

    public void eat() {
        collectGrass();
        chewing();
        ingest();
        digest();
    }

    public void move() {

    }

    //=========================

    public void collectGrass(){

    }
}
