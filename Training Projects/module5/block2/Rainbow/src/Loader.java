public class Loader {

    public static void main(String[]args) {

        String rainbow[] = {"Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Violet"};

        printMassive("До:", rainbow);
        rainbow = getInversionMassive(rainbow);
        printMassive("После:", rainbow);
    }

    //Переворачивает массив
    public static String[] getInversionMassive(String massive[]){
        for (int i = 0; i < massive.length / 2; i++) {
            String cell = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = cell;
        }
        return massive;
    }

    //Выводит все элементы массива
    public static void printMassive(String comment, String massive[]){
        System.out.println(comment);
        for(String item : massive) {
            System.out.println("   " + item);
        }
        System.out.println();
    }
}
