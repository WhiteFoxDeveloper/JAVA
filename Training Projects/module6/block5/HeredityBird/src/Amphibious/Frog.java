package Amphibious;

public class Frog extends Amphibian{

    public Frog(){
        weight = (int) Math.round(35 + 165 * Math.random());
    }

    public void voice() {
        System.out.println("Лягушка Ква-ква" + "\nВес: " + editUnit());
    }

    public void eat() {
        catchBug();
        ingest();
        digest();
    }

    public void move() {

    }

    public void swim() {

    }

    public void walk() {

    }

    public void jump() {

    }

    //======================

    public void catchBug(){

    }
}
