
public class Loader
{
    public static void main(String[] args) {


        Integer milk = 300; // ml
        Integer powder = 400; // g
        Integer eggs = 4; // items
        Integer sugar = 10; // g
        Integer oil = 30; // ml
        Integer apples = 8;// items


        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if(powder >= 400 && sugar >= 10 && milk >= 1l && oil >= 30){
        System.out.println("Pancakes");
        }

        //milk - 300 ml, powder - 5 g, eggs - 5
        if(milk >= 300 && powder >= 5 && eggs >= 5){
        System.out.println("Omelette");
        }

        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if(apples >= 3 && milk >= 100 && powder >= 300 && eggs >= 4){
        System.out.println("Apple pie");
        }
    }
}
