
import java.util.*;

public class Loader{
    /**
     * ввод НОМЕР -> ИМЯ нет -> запросить ИМЯ
     * ввод НОМЕР -> ИМЯ есть -> вывод ИМЯ
     * ввод ИМЯ -> НОМЕР нет -> запросить НОМЕР
     * ввод ИМЯ -> НОМЕР есть -> вывод НОМЕР
     * ввод LIST -> вывод всех абонементов в алфавитном порядке
     *
     * ФИО должно быть всегда из 3 слов - фамилия, имя, отчество
     * ФИО должно состоять из 6 символов минимум
     * НОМЕР должен всегда состоять из 11 цифр
     */
    static Map<String, String> book = new TreeMap<>(); //new TreeMap<String, String>(Collections.reverseOrder());
    static Set<Map.Entry<String, String>> entrySet = book.entrySet();

    public static void main(String[]args) {
        for (; ; ) {
            String input = getInfo("\nВвод: ");

            if (input.equals("LIST")) {
                printBook();
            } else if (getCountNumber(input) != 0) {
                if (getCountNumber(input) == 11 && getCountLetter(input) == 0) {
                    input = input.replaceAll("[^0-9]+", "");
                    if (book.containsKey(input)) {
                        printName(input);
                    } else {
                        book.put(input, getName("Введите ФИО:"));
                    }
                } else {
                    System.out.println("Ошибка, некорректный номер телефона");
                }
            } else {
                input = input.replaceAll("[^А-Яа-я ]+", "");
                if (getCountLetter(input) <= 5 || getCountSpace(input) != 2){
                    System.out.println("Ошибка, некорректное ФИО");
                }else if (book.containsValue(input)){
                    printNumber(input);
                }else {
                    book.put(getNumber("Введите номер телефона:"), input);
                }
            }
        }
    }

    //Выводит в консоль номер найденный по имени
    static void printNumber(String name){
        for (Map.Entry<String, String> pair : entrySet) {
            if (name.equals(pair.getValue())) {
                System.out.println(pair.getKey());
            }
        }
    }

    //Выводит в консоль имя найденное по номеру
    static void printName(String number){
        for (Map.Entry<String, String> pair : entrySet) {
            if (number.equals(pair.getKey())) {
                System.out.println(pair.getValue());
            }
        }
    }

    //Запрашивает и возвращает ИМЯ
    static String getName(String comment){
        String input = getInfo(comment);
        for (;;){
            if (getCountLetter(input) <= 5 || input.equals("LIST")) {
                input = getInfo("Это не ФИО, введите еще раз:");
            }else if (book.containsValue(input)){
                input = getInfo("Это ФИО уже есть в списке, введите ещё раз:");
            }else {
                break;
            }
        }
        return input.replaceAll("[^А-Яа-я]+", "");
    }

    //Запрашивает и возвращает Номер
    static String getNumber(String comment){
        String input = getInfo(comment);
        for (;;){
            if (getCountNumber(input) != 11 || getCountLetter(input) != 0) {
                input = getInfo("Это не номер телефона, введите еще раз:");
            }else if (book.containsKey(input)){
                input = getInfo("Этот номер телефона уже есть в списке, введите ещё раз:");
            }else {
                break;
            }
        }
        return input.replaceAll("[^0-9]+", "");
    }

    //Возвращает кол-во цифр в тексте
    static int getCountNumber(String input) {
        return input.replaceAll("[^0-9]+", "").length();
    }

    //Возвращает кол-во букв в тексте
    static int getCountLetter(String input){
        return input.replaceAll("[^А-Яа-я]+", "").length();
    }

    //Возвращает кол-во пробелов в тексте
    static int getCountSpace(String input){
        return input.replaceAll("[^ ]", "").length();
    }

    //Возвращает текст с консоли без лишних пробелов
    static String getInfo(String text) {
        Scanner in = new Scanner(System.in);
        System.out.println(text);
        String input = in.nextLine().replaceAll("\\s+", " ").trim();
        input = input.indexOf(" ") == 0 ? input.substring(1) : input;
        return input;
    }

    //Выводит массив Book
    static void printBook(){
        for (Map.Entry e : book.entrySet()) {
            System.out.println(e.getValue() + "    " + e.getKey());
        }
    }
}
