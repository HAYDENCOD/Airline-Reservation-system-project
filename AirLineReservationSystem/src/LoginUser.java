import javax.swing.*;

public class LoginUser extends JDialog {
    private JPanel contentPane;
    private JLabel login;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton signInButton;
    private JButton signUpButton;
    private JButton buttonOK;

    public LoginUser() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }
}
