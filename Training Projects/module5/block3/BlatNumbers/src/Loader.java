
import java.util.ArrayList;
import java.util.Scanner;

public class Loader {

    //формат номеров авто: А111АА 111
    //Зашифрованная база блатных номеров:
    static String series[] = {"EKX 99 177 97 #999", "XKX #999", "AMP #30", "COO 77 #999", "AOO 77 #999", "MOO 77 #999", "BOO 77 #999", "KOO 77 #999", "BKP 177 #999",
            "EKP 177 #999", "KKP 177 #999", "AKP 177 #999", "EPE 177 #999", "PMP 77 #999", "AMO 77 #999", "XAA 99 #999", "AAA #999", "AMM #999",
            "BMP #999", "EEE #999", "KKK #999", "KKX #999", "KMM #999", "KMP #999", "MMM #999", "MMP #999",
            "HHH #999", "OMP #999", "OOO #999", "CAC #999", "CMM #999", "CCC #999", "TMP #999", "XXX #999", "HAA 99 #999", "TAA 99 #999", "CAA 99 #999"};
    static ArrayList<String> blatNumbers = new ArrayList();


    public static void main(String[]args) {
        System.out.println("Формат номеров: A111AA 111");
        decryption();
        for (; ; ) {
            String checkNumber = getInfo("\nВведите номер авто: ");
            long startTime = System.currentTimeMillis();
            System.out.println(blatNumbers.contains(checkNumber) + " (" + (System.currentTimeMillis() - startTime) + " ms).");
        }
    }

    //Возвращает текст с консоли
    static String getInfo(String text){
        Scanner in = new Scanner(System.in);
        System.out.println(text);
        String scanNumber = in.nextLine();
        return scanNumber;
    }

    //Расшифровывает массив series в элементы блатных номеров
    static void decryption() {
        for (int i = 0; i < series.length; i++) {
            int limit = Integer.parseInt(series[i].substring(series[i].indexOf("#") + 1)); //лимит номеров
            String part1 = series[i].substring(0,3); //первые 3 буквы
            String part2[] = (series[i].substring(4, series[i].indexOf("#"))).split(" "); //все регионы
            createBaseBlatNumbers(limit, part1, part2);
        }
    }

    //Создает массив блатных номеров
    static void createBaseBlatNumbers(int limit, String part1, String part2[]) {
        String cell1, cell2;
        int regions = part2[0].equals("") == true ? 199 : part2.length;
        for (int a = 0; a < regions; a++) {
            cell2 = part2[0].equals("") == true ? String.valueOf(a+1) : part2[a];
            for (int b = 0; b <= limit; b++) {
                cell1 = String.valueOf(b);
                cell1 = cell1.length() == 1 ? "00" + cell1 : cell1.length() == 2 ? "0" + cell1 : cell1;
                blatNumbers.add(part1.substring(0, 1) + cell1 + part1.substring(1) + " " + cell2);
            }
        }
    }
}