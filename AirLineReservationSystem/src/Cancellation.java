import javax.swing.*;

public class Cancellation extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public Cancellation() {
        JFrame  frame = new JFrame();
        frame.setContentPane(contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.pack();
    }

    public static void main(String[] args) {
        Cancellation dialog = new Cancellation();
    }
}
