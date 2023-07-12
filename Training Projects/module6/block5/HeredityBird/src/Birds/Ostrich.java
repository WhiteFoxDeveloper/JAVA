package Birds;

public class Ostrich
        extends Cassowary
        implements Comparable<Ostrich>
{


    public Ostrich(){
        weight = (int) Math.round(50000 + 120000 * Math.random());
    }

    public void voice() {
        System.out.println("Страус У-у-уу" + "\nВес: " + editUnit());
    }

    public void eat(){
        tearLeaves();
        bite();
        chewing();
        ingest();
        digest();
    }

    public void walk(){

    }

    public void run(){

    }

    public void move() {

    }

    public int compareTo(Ostrich ostrich){
        return Math.round(ostrich.weight - this.weight);
    }

    private void tearLeaves(){

    }
}
