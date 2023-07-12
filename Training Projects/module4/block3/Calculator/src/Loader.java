public class Loader {

    public static void main(String[] args){
        double res;
        res = 24.0 * 0.1;
        System.out.println("Итог: " + res);
        System.out.println("Max: " + Double.MAX_VALUE + "\nMin: " + Double.MIN_VALUE);
    }
    /**Результат не правельный, из ниоткуда вылезло лишнее число.
     * Вопрос: Как это произошло и как исправить?*/

}
