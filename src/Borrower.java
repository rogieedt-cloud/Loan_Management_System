import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Borrower extends JFrame {
    private JPanel mainpanel;
    private JButton CALCULATEButton;
    private JButton BACKButton;
    private JTextField namet;
    private JTextField loant;
    private JTextField ratet;
    private JTextField montht;
    private JLabel duedatelabel;
    private JLabel totallabel;
    private JLabel interestlabel;

    Borrower() {

        setTitle("Borrower Registration");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(mainpanel);
        


        CALCULATEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            add();
            }
        });


        BACKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Dashboard();
                dispose();
            }
        });


    }

    void add() {
        try {
            Double loan = Double.parseDouble(loant.getText());
            Double rate = Double.parseDouble(ratet.getText());
            int months = Integer.parseInt(montht.getText());

            Double interest = loan * (rate / 100);
            Double total = loan + interest;
            String dueDate = months + " months from today";

            interestlabel.setText(String.valueOf(interest));
            totallabel.setText(String.valueOf(total));
            duedatelabel.setText(dueDate);

            JOptionPane.showMessageDialog(null, "Borrower Registered!\n" +
                    "Name: " + namet.getText() + "\n" +
                    "Loan Amount: " + loan + "\n" +
                    "Interest: " + interest + "\n" +
                    "Total Payable: " + total + "\n" +
                    "Due Date: " + dueDate);

        } catch (NumberFormatException e) {
            interestlabel.setText("Invalid");
            totallabel.setText("Invalid");
            duedatelabel.setText("Invalid");
        }
    }
}
