import java.util.Calendar;
import java.util.Date;


public class Loader {

    //YearOfBirth
    public static void main(String[]args){
        BirthDay(2005,100, Calendar.APRIL, 14);
    }

    public static void BirthDay(int YearOfBirth, int age, int month, int day){
        Calendar calendar = Calendar.getInstance();

        for (int a = 0; a <= age; a++) {
            calendar.set(YearOfBirth, month, day);
            Date date = calendar.getTime();
            System.out.println(a + " лет: " + date);
            YearOfBirth++;
        }
    }
}
