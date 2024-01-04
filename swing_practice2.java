import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class swing_practice2 {
    public static void main(String[] args) {
        Frame obj = new Frame();
    }
}
class Frame extends JFrame implements ActionListener{
    JTextField t1,t2;
    JButton b;
    JLabel l;
    Frame(){
        JFrame j = new JFrame();   
        j.setVisible(true);     // Making the frame visible

        j.setSize(200,300);  // Setting up the size

        t1  = new JTextField(10);   // Taking First input by creating a BOX or TextField
        t2  = new JTextField(10);   // Taking the Second input

        b = new JButton("Add numbers");   // Creating a button to perform addition

        l = new JLabel("Result");   // Result will show here

        j.setLayout(new FlowLayout());   // Fixing the layout so that all text can dispay on same Frame

        // Adding everything(TextField, Button, Result Lable) into the Frame
        j.add(t1);
        j.add(t2);
        j.add(b);
        j.add(l);

        /* To make our Button(Add number) work we need to implement ActionListener Interface 
         Lets understand by a realLife exampple :- when we will click that button, it need to listen that action that somebody
         click me and Now I have to do the given work(The work is on a method of this interface)*/
        b.addActionListener(this);   // ActionListener is an InterFace and 'this' keyword is object of that Interface

        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Stopping our code
    }

    // This is the method of ActionListener Interface and In this method we can make our button work according to us
    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());   // Type casting the t1 from string to integer
        int num2 = Integer.parseInt(t2.getText());   // Type casting the t2 from string to integer
        int ans = num1 + num2;
        l.setText(ans +" ");   // Converting integer variable(ans) from interger to string[int + string = string]
    }
}