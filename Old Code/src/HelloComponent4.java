class HelloComponent4 extends JComponent implements MouseMotionListener, ActionListener, Runnable {
	String theMessage;
	int messageX = 125, messageY = 95;
	JButton theButton;
	
	int colorIndex;
	static Color[] someColors = {Color.black, Color.red, Color.green, Color.blue, Color.magenta};
	
	boolean blinkState;
   
   public HelloComponent4() {
      this("Hello World!");
   }// Default constructor
	
	public HelloComponent4(String message) {
		theMessage = message;
		theButton = new JButton("Change Color");
		setLayout(new FlowLayout());
		add(theButton);
		theButton.addActionListener(this);
		addMouseMotionListener(this);
		Thread t = new Thread(this);
		t.start();
	} // specialized constructor
	
	public void paintComponent(Graphics g) {
		g.setColor(blinkState ? Color.white : currentColor());
		g.drawString(theMessage, messageX, messageY);
	}// paintComponent
	
	public void mouseDragged(MouseEvent e) {
		messageX = e.getX();
		messageY = e.getY();
		repaint();
	}// mouseDragged
	
	public void mouseMoved(MouseEvent e) {}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == theButton)
		    changeColor();
	} // actionPerformed
	
	synchronized private void changeColor() {
		if (++colorIndex == someColors.length)
		    colorIndex = 0;
		setForeground(currentColor());
		repaint();
	}// changeColor
	
	synchronized private Color currentColor() {
		return someColors[colorIndex];
	}// currentColor
	
	public void run() {
		try {
			while(true) {
				blinkState = !blinkState;
				repaint();
				Thread.sleep(1000);
			}//while
		} catch (InterruptedException ie) {}
	}// run
}//HelloComponent4
