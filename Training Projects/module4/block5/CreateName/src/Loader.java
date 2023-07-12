import java.util.Scanner;

public class Loader {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите Фамилию, имя и отчество: ");
        String name = sc.nextLine().trim();

        int v1;
        String n1, n2;

        for (int a = 1; a <= 3; a++){
         n1 = a == 1 ? "Фамилия: " : a == 2 ? "Имя: " : "Отчество: ";
         v1 = name.indexOf(" ");
         n2 = name.substring(0, v1);
         System.out.println(n1 + n2);
         name = name.substring(v1).trim() + " ";
        }
    }
}
