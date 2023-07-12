import org.javagram.TelegramApiBridge;
import org.javagram.response.AuthCheckedPhone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader {
    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TelegramApiBridge bridge = new TelegramApiBridge("149.154.167.50:443", 384547, "132c0889775dc9104a0a828b995b03ad");

        System.out.println("Номер телефона: ");
        AuthCheckedPhone checkedPhone = bridge.authCheckPhone(reader.readLine().trim());
        System.out.println(checkedPhone.isRegistered());
    }
}
//+79237708362
//46.43.215.161
//149.154.167.50:443