//import javax.swing.*;


import javax.swing.JFileChooser;

import java.io.File;
public class JoptionPaneTest {
   public static void main(String[] args) {
    //Create a file chooser
 JFileChooser fileChooser=new JFileChooser();

 //File chooser will appear in no windows parent
 int a=fileChooser.showOpenDialog(null);

 //Action that will take when user click open button
 if(a==JFileChooser.APPROVE_OPTION)
 {
  //Get file that want to open
  File fileToOpen=fileChooser.getSelectedFile();

  try
  {
   //Open file using suitable program on computer.
   //You don't need to tell what program to use.
   //Java will select default program that your
   //computer use to open the file.
   //In windowsXP you can see what
   //program that your computer use to open
   //a file by right click on file,
   //choose properties and see at
   //Opens with : ProgramNameToOpenTheFile
   //Desktop.getDesktop().open(fileToOpen);
   if (fileToOpen.exists()) {
       System.out.println("Yayyy!");
   }
  }
  catch(Exception exception)
  {
   System.out.println("Problem occour when to open the file");
  }
 }
      JFrame frame = new JFrame("JoptionPane Test");
      frame.setSize(200, 200);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      JOptionPane.showMessageDialog(frame, "Hello Java");
      JOptionPane.showMessageDialog(frame, "You have less amount, please recharge","Apocalyptic message", JOptionPane.WARNING_MESSAGE);
      int result = JOptionPane.showConfirmDialog(null, "Do you want to remove item now?");
      switch (result) {
         case JOptionPane.YES_OPTION:
         System.out.println("Yes");
         break;
         case JOptionPane.NO_OPTION:
         System.out.println("No");
         break;
         case JOptionPane.CANCEL_OPTION:
         System.out.println("Cancel");
         break;
         case JOptionPane.CLOSED_OPTION:
         System.out.println("Closed");
         break;
      }
      String name = JOptionPane.showInputDialog(null, "Please enter your name.");
      System.out.println(name);
      JTextField userField = new JTextField();
      JPasswordField passField = new JPasswordField();
      String message = "Please enter your user name and password.";
      result = JOptionPane.showOptionDialog(frame, new Object[] {message, userField, passField},
      "Login", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
      if (result == JOptionPane.OK_OPTION)
      System.out.println(userField.getText() + " " + new String(passField.getPassword()));
      System.exit(0);
   }
}