
public class Loader {

    public static void main(String args[]) {
        String name1, name2, name3;
        name1 = "";
        name2 = "";
        name3 = "";
        int DimaAge, VasyaAge, MichaAge, oldest, youngest, middle, a, b, c, d, f, g;
        youngest = 0;
        middle = 0;
        oldest = 0;


        DimaAge = 11;
        VasyaAge = 11;
        MichaAge = 11;


        a = DimaAge - VasyaAge;
        b = DimaAge - MichaAge;
        c = VasyaAge - MichaAge;
        d = VasyaAge - DimaAge;
        f = MichaAge - DimaAge;
        g = MichaAge - VasyaAge;

        /**
         * Результаты вычитания
         * 1 - результат положительный
         * 0 - результат отрицательный
         * -1 - результат 0
         */

        if (a > 0) {
            a = 1;
        } else if (a < 0) {
            a = 0;
        } else {
            a = -1;
        }

        if (b > 0) {
            b = 1;
        } else if (b < 0) {
            b = 0;
        } else {
            b = -1;
        }

        if (c > 0) {
            c = 1;
        } else if (c < 0) {
            c = 0;
        } else {
            c = -1;
        }

        if (d > 0) {
            d = 1;
        } else if (d < 0) {
            d = 0;
        } else {
            d = -1;
        }

        if (f > 0) {
            f = 1;
        } else if (f < 0) {
            f = 0;
        } else {
            f = -1;
        }

        if (g > 0) {
            g = 1;
        } else if (g < 0) {
            g = 0;
        } else {
            g = -1;
        }

        /**
         * Сравение результатов.
         * Присвоение меньшее к меньшему, большее к большему.
         */

        if (a == 0 && b == 0) {
            youngest += DimaAge;
            name3 += "Дима";
        } else if (c == 0 && d == 0) {
            youngest += VasyaAge;
            name3 += "Вася";
        } else if (f == 0 && g == 0) {
            youngest += MichaAge;
            name3 += "Миша";
        }

        if (d == 0 && f == 0) {
            oldest += DimaAge;
            name1 += "Дима";
        } else if (a == 0 && g == 0) {
            oldest += VasyaAge;
            name1 += "Вася";
        } else if (b == 0 && c == 0) {
            oldest += MichaAge;
            name1 += "Миша";
        }

        if (a == 1 && b == 0 || a == 0 && b == 1) {
            middle += DimaAge;
            name2 += "Дима";
        } else if (c == 1 && d == 0 || c == 0 && d == 1) {
            middle += VasyaAge;
            name2 += "Вася";
        } else if (f == 1 && g == 0 || f == 0 && g == 1) {
            middle += MichaAge;
            name2 += "Миша";
        }

        /**
         * Поиск одинаковых возрастов с значеним -1
         */

        if (a == -1 && b != -1) {
            if (DimaAge > MichaAge) {
                oldest += DimaAge;
                name1 += "Дима и Вася";
            } else {
                youngest += DimaAge;
                name3 += "Дима и Миша";
            }
        }

        if (b == -1 && a != -1) {
            if (DimaAge > VasyaAge) {
                oldest += DimaAge;
                name1 += "Дима и Миша";
            } else {
                youngest += DimaAge;
                name3 += "Дима и Вася";
            }
        }

        if (c == -1 && a != -1) {
            if (VasyaAge > DimaAge) {
                oldest += VasyaAge;
                name1 += "Вася и Миша";
            } else {
                youngest += VasyaAge;
                name3 += "Вася и Миша";
            }
        }

        /**
         * Особый случай, если все возроста совпали, тоесть все переменные с значеним -1
         */

        if (a == -1 && b == -1) {
            System.out.println(VasyaAge + " лет. Зовут: Дима, Вася и Миша");
            return;
        }

        /**
         * Результаты.
         */

        System.out.println("Старший возраст: " + oldest + ". Зовут: " + name1 + ".");
        if (VasyaAge != DimaAge && VasyaAge != MichaAge && MichaAge != DimaAge) {
            System.out.println("Средний возраст: " + middle + ". Зовут: " + name2 + ".");
        }
        System.out.println("Молодой возраст: " + youngest + ". Зовут: " + name3 + ".");
    }
}
