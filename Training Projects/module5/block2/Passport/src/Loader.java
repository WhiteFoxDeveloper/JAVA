
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

//1-8, 11-15, 17-29, 32-34, 36-38, 40-69, 72-99
//1997-2019 - Year

public class Loader {
    public static void main(String[]args){
        int i = 0;
        String REG, YEAR;
        String passport[][] = new String[99][(Y()-1997)+1];

        for(int regions = 0; regions < 99;){
            i++;
            for (boolean check = true; check == true;){
                regions++;
                check = regions >= 1 && regions <= 8 || regions >= 11 && regions <= 15 || regions >= 17 && regions <= 29
                        || regions >= 32 && regions <= 34 || regions >= 36 && regions <= 38 || regions >= 40 && regions <= 69
                        || regions >= 72 && regions <= 99 ? false : true;
            }
            for (int a = 0; a <= (Y()-1997); a++){

                YEAR = (Integer.toString(1997+a).substring(2));
                REG = String.valueOf(regions);
                passport[i][a] = REG + " " + YEAR;
                System.out.println(passport[i][a]);
            }
        }
    }

    public static int Y(){
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        calendar.setTime(new Date());
        return calendar.get(Calendar.YEAR);
    }
}
