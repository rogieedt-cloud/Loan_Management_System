import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoanPayment extends JFrame {
    private JTextField totalt;
    private JTextField paidt;
    private JTextField dayt;
    private JButton CALCULATEButton;
    private JButton BACKButton;
    private JPanel mainpanel;
    private JLabel penaltylabel;
    private JLabel remaininglabel;

    public LoanPayment() {

        setTitle("Loan Payment & Penalty");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(mainpanel);
        setVisible(true);



        CALCULATEButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
            add();
            }
        });


        BACKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Dashboard().setVisible(true);
                dispose();
            }
        });
    }

    public void add() {
        try {
            Double total = Double.parseDouble(totalt.getText());
            Double paid = Double.parseDouble(paidt.getText());
            int daysLate = Integer.parseInt(dayt.getText());

            Double penalty = daysLate * 50.0;
            Double remaining = (total + penalty) - paid;

            penaltylabel.setText(String.valueOf(penalty));
            remaininglabel.setText(String.valueOf(remaining));

            JOptionPane.showMessageDialog(null,
                    "Payment Details\n" +
                            "Total Payable: " + total + "\n" +
                            "Paid: " + paid + "\n" +
                            "Days Late: " + daysLate + "\n" +
                            "Penalty: " + penalty + "\n" +
                            "Remaining Balance: " + remaining);

        } catch (NumberFormatException e) {
            penaltylabel.setText("Invalid");
            remaininglabel.setText("Invalid");
        }
    }
}
