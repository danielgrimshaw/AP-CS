//HelloWorld.java
//Demonstrates writing to a graphical screen

package grimshaw.daniel.examples;

import javax.swing.*;
import java.awt.*;

class HelloComponent extends JComponent {
	public void paintComponent(Graphics g) {
		g.drawString("Hello World", 125, 95);
	}
}
public class HelloWorld {
	public static void main( String[] args ) {
		JFrame frame = new JFrame("Hello World!");
		/* JLabel label = new JLabel("Hello World!", JLabel.CENTER);
		frame.add(label); */
		frame.add(new HelloComponent());
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
