import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class reservation extends JDialog {
    private JPanel contentPane;
    private JComboBox Destination;
    private JComboBox currentLocation;
    private JButton bookFlightButton;
    private JButton cancelFlightButton;

    public reservation() {
        JFrame  frame = new JFrame();
        frame.setContentPane(contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.pack();

        bookFlightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Your Reservation Code is this:");
            }
        });
        cancelFlightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cancellation now = new Cancellation();
                now.getClass();
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        reservation  dialog = new reservation();

    }
}
