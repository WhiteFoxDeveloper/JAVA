package Birds;

public class Sparrow
        extends Flight
        implements Comparable<Sparrow>
{

    public Sparrow(){
        weight = (int) Math.round(10 + 50 * Math.random());
    }

    public void voice() {
        System.out.println("Воробей Чик-чирик" + "\nВес: " + editUnit());
    }

    public void eat(){
        catchWorm();
        ingest();
        digest();
    }

    public void jump(){

    }

    public void fly(){

    }

    public void move() {

    }

    public int compareTo(Sparrow sparrow){
        return Math.round(sparrow.weight - this.weight);
    }

    private void catchWorm(){

    }
}
