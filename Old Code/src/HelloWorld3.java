//HelloWorld3.java
//Demonstrates buttons and changing text colors

package grimshaw.daniel.examples;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloWorld3 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello World 3");
		frame.add(new HelloComponent3("Hello World"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	} //main
}//HelloWorld3

class HelloComponent3 extends JComponent implements MouseMotionListener, ActionListener {
	String theMessage;
	int messageX = 125, messageY = 95;
	
	JButton theButton;
	
	int colorIndex;
	static Color[] someColors = {Color.black, Color.red, Color.green, Color.blue, Color.magenta};
   
   public HelloComponent3() {
      this("Hello World!");
   } //default constructor
	
	public HelloComponent3(String message) {
		theMessage = message;
		theButton = new JButton("Change Color");
		setLayout(new FlowLayout());
		add(theButton);
		theButton.addActionListener(this);
		addMouseMotionListener(this);
	} // specialized constructor
	
	public void paintComponent(Graphics g) {
		g.drawString(theMessage, messageX, messageY);
	} // paintComponent
	
	public void mouseDragged(MouseEvent e) {
		messageX = e.getX();
		messageY = e.getY();
		repaint();
	} // mouseDragged
	
	public void mouseMoved(MouseEvent e) {}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == theButton)
		    changeColor();
	}// actionPerformed
	
	synchronized private void changeColor() {
		if (++colorIndex == someColors.length)
		    colorIndex = 0;
		setForeground(currentColor());
		repaint();
	}// changeColor
	
	synchronized private Color currentColor() {
		return someColors[colorIndex];
	}// currentColor
}// HelloComponent3
		
