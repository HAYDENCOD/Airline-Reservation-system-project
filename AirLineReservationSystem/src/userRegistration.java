import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class userRegistration extends JDialog {
    private JPanel contentPane;
    private JTextField firstnameText;
    private JTextField emailtext;
    private JTextField ageTxt;
    private JTextField secnameText;
    private JPasswordField passText1;
    private JTextField tellText;
    private JLabel first_Name;
    private JLabel email;
    private JLabel age;
    private JLabel password;
    private JTextField confirmpassText;
    private JComboBox paymentChoice;
    private JButton signup;
    private JButton signInButton;
    private JTextField UserName;
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


        signup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              reservation now = new reservation();
              now.getClass();
              frame.dispose();

            }
        });
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginUser now = new LoginUser();
                now.getClass(); frame.dispose();
            }
        });



    }
    static class user{
        String fName;
        String lName;
        String tell;
        String email;
        char[] password;

        public user(String fName, String lName, String tell, String email, char[] password) {
            this.fName = fName;
            this.lName = lName;
            this.tell = tell;
            this.email = email;
            this.password = password;
        }

        public void setlName(String lName) {
            this.lName = lName;
        }

        public void setTell(String tell) {
            this.tell = tell;
        }

        public String getfName() {
            return fName;
        }

        public void setfName(String fName) {
            this.fName = fName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public char[] getPassword() {
            return password;
        }

        public void setPassword(char[] password) {
            this.password = password;
        }
    }

    public static void main(String[] args) {
        userRegistration dialog = new userRegistration();

    }
}
