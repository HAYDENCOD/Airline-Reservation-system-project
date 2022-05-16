import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cancellation extends JDialog {
    private JPanel contentPane;
    private JTextField reserveCode;
    private JButton cancelTripButton;
    private JButton returnToReservationButton;

    public Cancellation() {
        JFrame  frame = new JFrame();
        frame.setContentPane(contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.pack();
        returnToReservationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reservation now = new reservation();
                now.getClass();
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        Cancellation dialog = new Cancellation();
    }
}
