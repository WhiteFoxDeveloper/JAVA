package Birds;


import MainPackage.Animal;
import MainPackage.Vertebrata;

public abstract class Bird
        extends Animal
{
    public int legsCount = 2;

    public void eat() {
        ingest();
        digest();
    }
}
