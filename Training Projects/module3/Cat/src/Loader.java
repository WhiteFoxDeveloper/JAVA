
public class Loader
{

    public static void main(String[] args)
    {
        Cat Timka,MrSnowPaw,Murzik,Barsik, Murka;





        Murka = new Cat(true);            Murka.meow(10);
        Timka = new Cat(false);            Timka.meow(10000);
        MrSnowPaw = new Cat(false);        MrSnowPaw.feed((double) 10);
        Murzik = new Cat(false);           Murzik.feed((double) 50);
        Barsik = new Cat(4000.0);           Barsik.drink((double) 1000);

        Timka.duplicateCat(Murka);


        System.out.println("\nМурка: " + Murka.getStatus()+"\nВес: "+ Murka.getWeight());
        System.out.println("\nТимка: " + Timka.getStatus()+"\nВес: "+ Timka.getWeight());
        System.out.println("\nМистер снежная лапка: "+ MrSnowPaw.getStatus()+"\nВес: "+ MrSnowPaw.getWeight());
        System.out.println("\nМурзик: " + Murzik.getStatus()+"\nВес: "+ Murzik.getWeight());
        System.out.println("\nБарсик: " + Barsik.getStatus()+"\nВес: "+ Barsik.getWeight() + Barsik.CatToilet());
        System.out.println(Cat.getCount());
    }
}