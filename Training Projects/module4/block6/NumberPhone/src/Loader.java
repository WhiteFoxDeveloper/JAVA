import java.util.Scanner;

public class Loader {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        String phone = sc.nextLine().replaceAll("[^0-9]+", "");
        System.out.println("Ваш номер телефона: " + phone);
    }
}
