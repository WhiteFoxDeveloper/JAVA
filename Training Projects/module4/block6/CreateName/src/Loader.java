import java.util.Scanner;
import java.util.regex.Pattern;

public class Loader {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите Фамилию, имя и отчество: ");
        String name = sc.nextLine().trim();
/**
 * Если Ф.И.О начинается с маленькой буквы или ъыь а так же если остольные символы после 1 заглавные, то выводится "Неверно введено Ф.И.О.".
 * Иначе Ф.И.О разбивает на 3 слова и перед ними добовляется фамилия, имя и отчество и выводится в консоль.
 */
        if (!Pattern.compile("[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+\\s[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+\\s"+
                "[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+$").matcher(name).matches()) {

            System.out.println("Неверно введено Ф.И.О.");
        }
        else{
            String[] FIO = {"Фамилия: ", "Имя: ", "Отчество: "};
            for(int a = 0; a < 3; a++) {
                String[] fullNameArray = name.split("\\s");
                System.out.println(FIO[a] + fullNameArray[a]);
            }
        }
    }
}
