public class Cat<NameCat> {
    private Double originWeight;
    private Double weight;

    private double amountWasteWeight;

    public static Integer count = 0;
    public static Integer naturalCount;

    private Double minWeight;
    private Double maxWeight;


    public Cat(Boolean Kitty) {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
        naturalCount = count;
        if(Kitty == true){Kitty();}
    }

    public Cat(double weight) {
        this(false);
        this.weight = weight;
    }

    public void Kitty(){
        weight = 100.0 + 200.0 * Math.random();
        originWeight = weight;
        maxWeight = 600.0;
        minWeight = 0.0;
    }


    public void meow(int amount) {
        for (int i = 1; i < amount + 1; i++) {

            weight = weight - 1;
            System.out.print("|Meow|");

            if (i == 20) {
                i = 0;
                amount -= 20;
                System.out.print("\n");
            }
        }

    }

    public void feed(Double amount) {
        weight += amount;
    }

    public void drink(Double amount) {
        weight += amount;
    }

    public String CatToilet() {
        amountWasteWeight = weight - originWeight;
        return "\nЛюбимец сделал кучу весом: " + amountWasteWeight + " гр!";
    }


    public static String getCount() {
        return( "\nКол-во живых любимцев: " + count+"/"+naturalCount );
    }

    public void duplicateCat(Cat NameCat){
        NameCat.weight = weight;
        NameCat.originWeight = originWeight;
    }


    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < minWeight) {
            count--;
            return "\n" + "Любимец погиб!";
        } else if (weight > maxWeight) {
            count--;
            return "\n" + "Любимец взорвался!";
        } else if (weight > originWeight) {
           return "\n" + "Любимец хорошо поел и пошёл спать." ;
        } else {
            return "\n" + "Любимец играет.";
        }
    }
}