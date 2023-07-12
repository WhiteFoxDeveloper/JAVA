package Birds;

public class Hen
        extends Cassowary
        implements Comparable<Hen>
{

    public Hen(){
        weight = (int) Math.round(500 + 2500 * Math.random());
    }

    public void voice() {
        System.out.println("Курица Ко-ко-ко" + "\nВес: " + editUnit());
    }

    public void eat(){
        dabGrains();
        ingest();
        digest();
    }

    public void walk(){

    }

    public void run(){

    }

    public void move() {

    }

    public int compareTo(Hen hen){
        return Math.round(hen.weight - this.weight);
    }

    private void dabGrains(){

    }
}
