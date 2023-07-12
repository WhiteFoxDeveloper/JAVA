public class Loader {
//☮

    public static void main(String[] args) {

        Symbols(0, 10000, 4);//1040 & 1104
    }

    public static void Symbols(long NumberSymbols, long NextNumberSymbols, int NumberSymbolsLine) {
        int b = 0;

        if (NumberSymbols != NextNumberSymbols) {

            /** Печать симболов.*/

            NextNumberSymbols--;
            System.out.print(" | ");

            for (long a = NumberSymbols; a <= NextNumberSymbols; a++) {
                System.out.print((char) a + " | ");

                /**Создание новой строки*/
                b++;
                if (b == NumberSymbolsLine && a != NextNumberSymbols) {
                    System.out.print("\n | ");
                    b = 0;
                }
            }
        }
    }
}
//Русские буквы от 1040 до 1104.