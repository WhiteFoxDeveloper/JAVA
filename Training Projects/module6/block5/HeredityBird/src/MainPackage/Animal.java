package MainPackage;

public abstract class Animal
        implements Vertebrata
{

    public boolean alive = true;
    public int weight;


    //глотать
    public final void ingest(){

    }

    //переваривать
    protected void digest(){

    }

    //жевать
    public void chewing(){

    }

    //откусить
    public void bite(){

    }

    //=================

    public String editUnit(){
        String unit;
        int kilograms = weight / 1000;
        int grams = weight % 1000;
        return unit = kilograms == 0 ? grams + "гр" : grams == 0 ? kilograms + "кг " : kilograms + "кг " + grams + "гр";
    }
}








