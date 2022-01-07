import javax.swing.JOptionPane;
import java.lang.*;
public class C6E18CheckPassword {
    public static void main(String[] args) {
        System.out.println("This program will show option dialog and require to enter a password, if the password meets the displayed \nconditions it will give a dialog saying the password is valid else it will give the password is invalid.");
        int option=JOptionPane.YES_OPTION;
        while(option == JOptionPane.YES_OPTION) {
            try {
                String password=JOptionPane.showInputDialog(
                "Enter a Password: Must be 8 or more" +
                " letters or numerical digits 2" +
                " of which must be digits" + "\nPress cancel if you don't want to enter password and wish to exit.");
                if (password!=null) {
                    isValidPassword(password);
                    option=JOptionPane.showConfirmDialog(null,
                    "Valid Password"+"\nDo yu want to continue");
                }
                else {
                    option = JOptionPane.showConfirmDialog(null, "Do you want to continue and give another try entering password?");
                }
            } // end try

            catch(Exception ex) {
                String outputStr = " Invalid Password: " + 
                ex.getMessage() + 
                "\nDo you want to continue? ";
                option = JOptionPane.showConfirmDialog(null, outputStr);
            } // end catcho
        } // end while
    } // end main()

        private static void isValidPassword(String str) throws Exception {
        // enter code to check password requirements
            if (str.length() < 8) {
                throw new Exception("Short password entered. The password does not meet the requirement of at least eight characters.");
            }
            if (str.matches("^[a-zA-Z0-9]*$") == false) {
                throw new Exception("Incorrect password entered. The password does not meet the requirement of only alphanumeric values.");
            }
            int counter = 0;
            for (int i =0; i < str.length(); i++) {
                char k = str.charAt(i);
                if (Character.isDigit(k) == true) {
                    counter += 1;
                }
                if (counter == 2) {
                    break;
                }
            }
            if (counter != 2) {
                throw new Exception("Incorrect password entered. The password does not meet the requirement od at least two digits.");
            }
           
        }// end isValidPassword
}