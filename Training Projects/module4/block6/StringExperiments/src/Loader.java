
public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        String object, money[];
        int IntMoney = 0;

        money = text.split("[^0-9]+");

        for (int a = 1; a <= 3; a++) {

            object = a == 1 ? "У Васи: " : a == 2 ? "У Пети: " : "А у Маши: ";
            System.out.println(object + money[a] + " руб");
            IntMoney += a != 2 ? Integer.valueOf(money[a]) : 0;
        }
        System.out.println("\nСумма Васи и Маши: " + IntMoney);
    }
}