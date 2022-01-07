import javax.swing.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;
public class C12E13CountCharacters {
    public static void main(String[] args) {
        boolean toContinue = true;
        Scanner inp = new Scanner(System.in);
        System.out.println("This program reads a text file, and prints the number of characters(whitespace excluded), \nthe number of characters(whitespace included), the number of words and the total number of lines in the file.");
        while (toContinue) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showOpenDialog(null);
            try {
                if(returnVal == JFileChooser.APPROVE_OPTION) {
                    File fileToRead = chooser.getSelectedFile();
                    Scanner inp1 = new Scanner(fileToRead);
                    int counterWords = 0;
                    int counterCharWithoutWhiteSpace = 0;
                    while(inp1.hasNext()) {
                        String w = inp1.next();
                        counterWords++;
                        counterCharWithoutWhiteSpace += w.length();
                    }
                    inp1.close();
                    Scanner inp2 = new Scanner(fileToRead);
                    int counterLines = 0;
                    int counterCharWithWhiteSpace = 0;
                    while(inp2.hasNextLine()) {
                        String l = inp2.nextLine();
                        counterLines++;
                        counterCharWithWhiteSpace += l.length();
                    }
                    inp2.close();
                    System.out.println("Total number of characters including whitespaces are: " + counterCharWithWhiteSpace);
                    System.out.println("Total number of characters without including whitespaces are: " + counterCharWithoutWhiteSpace);
                    System.out.println("Total number of lines in the file are: " + counterLines);
                    System.out.println("Total number of words in the file are: " + counterWords);
                    System.out.print("\nIf you wish to repeat this program, press 1 but if you wish to exit the program press 0: ");
                    if (inp.nextInt() != 1) {
                        toContinue = false;
                    }
                }
            }
            catch(Exception e) {
                System.out.println("There is a problem opening the file");
                if (inp.nextInt() != 1) {
                    toContinue = false;
                }
            }
        }
        
    }
}