import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginUser extends JDialog {
    private JPanel contentPane;
    private JLabel login;
    private JTextField userName;
    private JTextField emailText;
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
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userRegistration now = new userRegistration();
                now.getClass();
                frame.dispose();
            }
        });


    }

    public static void main(String[] args) {
        LoginUser dialog = new LoginUser();

    }
}
