import java.awt.*;
import javax.swing.*;

public class swing_practice1 {
    public static void main(String[] args) {
        abc obj = new abc();
    }
}
class abc extends JFrame{
    abc(){
        JFrame j = new JFrame();

        j.setVisible(true);  // Making the Frame visible 

        j.setSize(400, 300);   // Setting the size of Frame

        JLabel l = new JLabel("click on the below button");  // Calling the constructor of JLable and passing the text
        JLabel l1 = new JLabel("And nothing will happen");
        
        j.add(l);      // Adding the Lable or Text in the Frame
        j.add(l1);

        j.setLayout(new FlowLayout());    // Setting up the layout to display both the text on same Frame

        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // EXIT_ON_CLOSE is a constant which belongs to JFrame class
    }
}