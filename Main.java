import javax.swing.*;
import java.awt.event.*;

public class Main
{
  public static void main(String args[])
  {
    JFrame frame1 = new JFrame("This is a JFrame");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //MUST HAVE THIS LINE
    frame1.setSize(500,500);

    //========Button 1=========
    JButton button1 = new JButton("Click me!");
    button1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("Yay! You clicked the button!");
      }//end the block of what the button will do
    });//end the ActionListener
    frame1.add(button1);
    frame1.setVisible(true);
  }//end main method
}//end class Main