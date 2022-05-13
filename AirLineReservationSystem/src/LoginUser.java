import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

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
        LoginUser dialog = new LoginUser();

    }
}
