
import javax.swing.*;
import java.awt.*;


public class Loader {

    public static void main(String args[]){

        JFrame frame = new JFrame();
        frame.setSize(800,600 );
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("My first window");

        //Задание повышенной сложности.
        frame.setLocationRelativeTo(null);
    }
}
