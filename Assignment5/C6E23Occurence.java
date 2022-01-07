import java.util.Scanner;
public class C6E23Occurence {
    public static int count(String str, char a) {
        int counter = 0;
        for (int i = 0; i < str.length();i++) {
            if (str.charAt(i) == a) {
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        boolean toContinue = true;
        System.out.println("This program asks the user to input a string, followed by a character, and then finds the number of times the character occurs in the string. ");
        while (toContinue == true) {
            System.out.print("\nEnter a string followed by a space which is then followed by a character (the string and the character can be anything that are printable and found on American keyboard): ");
            String str = inp.next();
            char a = inp.next().charAt(0);
            int c = count(str, a);
            System.out.println("The character was found " + c + " times in the input string.");
            System.out.print("\nIf you wish to repeat this program, press 1 but if you wish to exit the program press 0: ");
            if (inp.nextInt() != 1) {
                toContinue = false;
            }
        }
    }
}