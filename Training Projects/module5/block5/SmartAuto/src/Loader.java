import java.util.ArrayList;
import java.util.Scanner;

public class Loader {
    /**
     * ввод НОМЕР -> НОМЕР нет, ИМЯ нет -> запросить ИМЯ
     * ввод НОМЕР -> НОМЕР есть, ИМЯ есть -> ввывод ИМЯ
     */
    static ArrayList<String> Number = new ArrayList();
    static ArrayList<String> Name = new ArrayList();

    public static void main(String[]args){
        System.out.println("Формат: A111AA 111");
        for (;;) Search();
    }
    static String GetInfo(String text) {
        Scanner in = new Scanner(System.in);
        System.out.println(text);
        String ScanNumber = in.nextLine().trim();
        return ScanNumber;
    }
    static void Search() {
        int a = 0;
        String number = GetInfo("");
        for (; (((Number.size() - 1) > a) && (Number.get(a).equals(number) == false)); a++) ;
        if (Number.size() == 0 || Number.get(a).equals(number) == false) {
            Number.add(number);
            Name.add(GetInfo("Введите Ф.И.О"));
        }else System.out.println(Name.get(a));
    }
}
