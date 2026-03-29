import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame {
    private JPanel mainpanel;
    private JButton BORROWERREGISTRATIONButton;
    private JButton LOANPAYMENTButton;
    private JButton LOGOUTButton;


    Dashboard(){
        setTitle("Dashboard");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(mainpanel);
        setVisible(true);


        BORROWERREGISTRATIONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Borrower();
                dispose();
            }
        });


        LOANPAYMENTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoanPayment();
                dispose();
            }
        });

        LOGOUTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Logged Out Successfully!");
                new Login();
                dispose();
            }
        });
    }
}
