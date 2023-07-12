import java.util.HashSet;
import java.util.Scanner;

public class Loader {
    static HashSet<String> MedList = new HashSet<>();

    public static void main(String[] args) {
        for (; ; ) {
            String text = GetInfo("");
            if (text.equals("LIST")){
                System.out.println("Список:");
                for (String name : MedList)
                    System.out.print(name + "\n");
            }
            else MedList.add(text);
        }
    }

    static String GetInfo(String text) {
        Scanner in = new Scanner(System.in);
        System.out.println(text);
        String ScanNumber = in.nextLine().trim();
        return ScanNumber;
    }
}
