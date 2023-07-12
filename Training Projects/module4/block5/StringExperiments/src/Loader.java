
public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        int entranceMoney1, entranceMoney2, money;
        String object, slotMemory;
        money = 0;

            /**Поиск числа в тексте*/
        for (int a = 1; a <= 3; a++) {
            entranceMoney2 = text.indexOf(" руб");
            entranceMoney1 = text.substring(0,entranceMoney2).lastIndexOf(" ");

            /**Вывод информации в консоль, и приоброзование String в Int. */
            object = a == 1 ? "У Васи: " : a == 2 ? "У Пети: " : "А у Маши: ";
            slotMemory = text.substring(++entranceMoney1, entranceMoney2);
            System.out.println(object + slotMemory + " руб");
            money += a != 2 ? Integer.valueOf(slotMemory) : 0;

            /**Переход к другой части текста*/
            text = text.substring(++entranceMoney2);
        }
        System.out.println("\nСумма Васи и Маши: " + money);
    }
}