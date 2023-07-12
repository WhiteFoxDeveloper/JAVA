public class Loader {

    public static void main(String args[]){

        int i = 199999;
        do {
        i++;
        System.out.println("Номер билета: "+ i);
        }while(i < 210000);
    }
}
    /**do{}while{} отличаеться от while{}, тем что всегда выполняет 1 тик
     * когда условие уже выполенено, а в остольном отличий нет.
     *
     * Например:
     * int a = 7
     * do{System.out,println(a)}
     * while(a < 5);
     *
     * Всё что в {} у do выполниться 1 раз и не войдёт в цикл т.к в while требует переменную "a" меньше 5.
      */

