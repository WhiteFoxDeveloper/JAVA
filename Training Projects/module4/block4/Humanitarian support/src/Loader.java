public class Loader {

    public static int d = 1;


    public static void main(String[] args){

        Calculation(1,12,27);
    }

    /**
     * Вычисления:
     */

    public static void Calculation(int Truck, int Container, int Cargo){
        for (int a = 1; a <= Truck; a++){
            System.out.println("Грузовик " + a + ":");

            for (int b = 1; b <= Container; b++){
                System.out.println("Контейнер " + b + ":");

                for (int c = 1; c <= Cargo; c++){
                    System.out.println("Ящик " + (d++));
                }
            }
        }
    }
}
