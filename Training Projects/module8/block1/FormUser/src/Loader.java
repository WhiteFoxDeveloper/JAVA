import javax.swing.*;

public class Loader {

    public static void main(String[] args){
        JFrame frame = new JFrame();
      Form form = new Form();
      frame.setContentPane(form.getPanel1());

      frame.setTitle("Registration");
      frame.setSize(800, 600);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      frame.setVisible(true);
    }
}
