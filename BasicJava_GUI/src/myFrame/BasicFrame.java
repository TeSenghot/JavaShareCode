package myFrame;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class BasicFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame myFrame = new JFrame(); //create a frame
myFrame.setVisible(true); //make frame visible
myFrame.setSize(420,420); //set the x-dimension,and y
myFrame.setTitle("SCORE RECORD");

myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Exit out of application



ImageIcon myimage = new ImageIcon("myshop.png");     //create an imageIcon
myFrame.setIconImage(myimage.getImage());//change icon of frame

myFrame.getContentPane().setBackground(Color.gray);

	}

}
