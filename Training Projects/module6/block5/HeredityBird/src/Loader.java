
import Amphibious.Frog;
import Birds.*;
import MainPackage.Animal;
import MainPackage.AnimalComparator;
import MainPackage.Vertebrata;
import Mammals.Horse;
import Pisces.Salmon;
import Reptiles.Lizard;

import java.util.ArrayList;
import java.util.Collections;

public class Loader {

    public static void main(String[]args){

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Duck());
        animals.add(new Sparrow());
        animals.add(new Horse());
        animals.add(new Duck());
        animals.add(new Duck());
        animals.add(new Salmon());
        animals.add(new Horse());
        animals.add(new Lizard());
        animals.add(new Hen());
        animals.add(new Ostrich());
        animals.add(new Frog());
        animals.add(new Hen());
        animals.add(new Hen());

        Collections.sort(animals, new AnimalComparator());

        for (Vertebrata animal : animals){
            animal.voice();
            System.out.println();
        }
    }
}
