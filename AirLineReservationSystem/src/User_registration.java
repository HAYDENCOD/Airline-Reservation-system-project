import java.util.Scanner;

public class User_registration {
    static class User{
        String first_name, last_name;
        String email;
        long telephone;
        int password;

        public User(String first_name, String last_name, String email, int password) {
            this.first_name = first_name;
            this.last_name = last_name;
            this.email = email;

            this.password = password;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public long getTelephone() {
            return telephone;
        }

        public void setTelephone(long telephone) {
            this.telephone = telephone;
        }

        public int getPassword() {
            return password;
        }

        public void setPassword(int password) {
            this.password = password;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         User user1 = new User("Paul", "Webo","paulwebo#8@gmail.com", 1234);
        System.out.println(user1.first_name +" " +user1.last_name +" "+ user1.email);
    }
}
