import javax.swing.*;

public class userRegistration extends JDialog {
    private JPanel contentPane;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField5;
    private JPasswordField passwordField2;
    private JTextField textField4;
    private JLabel first_Name;
    private JLabel email;
    private JLabel age;
    private JLabel password;
    private JTextField textField6;
    private JComboBox comboBox1;
    private JButton signup;
    private JButton signInButton;
    private JButton buttonOK;

    public userRegistration() {
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
        userRegistration dialog = new userRegistration();
    }
}
