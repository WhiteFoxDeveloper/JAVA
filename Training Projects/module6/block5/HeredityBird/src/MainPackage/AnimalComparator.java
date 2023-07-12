package MainPackage;

import Birds.*;

import java.util.Comparator;

public class AnimalComparator
        implements Comparator<Animal>
{

    public int compare(Animal a1, Animal a2) {
        return Math.round(a1.weight - a2.weight);
    }
}
