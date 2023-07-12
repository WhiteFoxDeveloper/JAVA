package Birds;

public class Duck
        extends Flight
        implements Comparable<Duck>
{

    public Duck(){
        weight = (int) Math.round(2000 + 5000 * Math.random());
    }

    public void voice() {
        System.out.println("Утка Кря-кря" + "\nВес: " + editUnit());
    }

    public void eat(){
        catchFish();
        ingest();
        digest();
    }

    public void swim(){

    }

    public void fly(){

    }

    public void move() {

    }

    public int compareTo(Duck duck){
        return Math.round(duck.weight - this.weight);
    }

    private void catchFish(){

    }
}
