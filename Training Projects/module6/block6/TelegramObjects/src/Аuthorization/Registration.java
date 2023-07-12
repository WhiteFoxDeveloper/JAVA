package Аuthorization;

import Entities.Accounts;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Registration {

    public static void run(String numberPhone) throws InterruptedException, IOException {
        //Cоздание GUI...

        //Тело кода
        String name, surname, roadFile;
        for (;;) {
            boolean keyContinue = false;
            for (; keyContinue == false; ) {
                Thread.sleep(50);
                //Ожидание нажатия кнопки продолжить... если нажали, то keyContinue = true
            }
            //Достаем ФИО и аватар...
            name = "";
            surname = "";
            roadFile = "";
            if (getCountLetter(name) == name.length() && getCountLetter(surname) == surname.length()){
                break;
            }
        }
        File file = new File(roadFile);
        BufferedImage imageAvatar = ImageIO.read(file);

    }

    static int getCountLetter(String input) {
        return input.replaceAll("[^A-zА-я]+", "").length();
    }
}
