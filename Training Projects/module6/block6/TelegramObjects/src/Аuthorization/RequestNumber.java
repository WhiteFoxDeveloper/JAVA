package Аuthorization;


public class RequestNumber extends RequestCode{

    public static void run() throws InterruptedException {
        //Создание GUI...

        //Тело кода

}

    //Получаем номер телефона
    static void getNumberPhone() {

    }

    //Отправляет код на номер телефона
    static String sendTrueCode(String numberPhone){
        String trueCode = "";

        return trueCode;
    }

    //Проверка номера телефона
    static boolean checkNumberPhone(String numberPhone) {
        boolean result = false;
        if (numberPhone.length() == 11) {
            result = true;
        }
        return result;
    }


}
