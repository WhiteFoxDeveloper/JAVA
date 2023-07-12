import java.util.ArrayList;
import java.util.Scanner;

public class Loader {
    static ArrayList<String> queue = new ArrayList();

    public static void main(String[] args) {
        System.out.print("exitLast - последний самолет покидает стоянку \nexitAll - все самолеты покидают стоянку");
        for (; ; ) {
            System.out.println();
            String command = getInfo("");
            if (command.equals("exitLast")) {
                exitLast();
            } else if (command.equals("exitAll")) {
                exitAll();
            } else if (queue.contains(command)){
                System.out.print("Номер уже в очереди");
            } else if (queue.size() != 5){
                queue.add(command);
                System.out.print("Добавлен в очередь");
            } else {
                System.out.print("Отказ во въезде");
            }
        }
    }

    //Возвращает текст с консоли
    static String getInfo (String text){
        Scanner in = new Scanner(System.in);
        System.out.println(text);
        String scanText = in.nextLine();
        return scanText.trim();
    }

    //удаляет все самолеты в очереди
    static void exitAll () {
        if (queue.size() != 0) {
            for (; queue.size() != 0; ) {
                System.out.print(queue.get(0) + "  ");
                queue.remove(0);
            }
        } else {
            System.out.print("Пуст");
        }
    }

    //удаляет последний самолет в очереди
    static void exitLast () {
        if (queue.size() != 0) {
            System.out.print(queue.get(0));
            queue.remove(0);
        } else {
            System.out.print("Пуст");
        }
    }
}