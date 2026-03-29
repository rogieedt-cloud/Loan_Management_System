import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JButton LOGINButton;
    private JTextField user;
    private JPasswordField pass;
    private JPanel mainpanel;

    Login(){

        setTitle("Login");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(mainpanel);
        setVisible(true);


         LOGINButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 String username = user.getText();
                 String password = new String(pass.getPassword());

                 if (username.equals("admin") && password.equals("1234")) {
                     JOptionPane.showMessageDialog(null, "Login Successful!");
                     new Dashboard();
                     dispose();
                 } else {
                     JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                 }
             }
         });



     }

    static void main() {
        new Login();

    }
}
