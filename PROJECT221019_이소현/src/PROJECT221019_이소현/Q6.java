package PROJECT221019_이소현;

import java.awt.*;
import javax.swing.*;

public class Q6 extends JFrame {
	public Q6() {
		this.setTitle("Random Labels");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(null);
		
		JLabel [] label = new JLabel[20];
		int randNum1 = 0;
		int randNum2 = 0;
		for(int i = 0; i < 20; i++) {
			label[i] = new JLabel(Integer.toString(i));
			
			randNum1 = (int)(Math.random()*220)+30;
			randNum2 = (int)(Math.random()*220)+30;
			
			label[i].setBounds(randNum1, randNum2, 20, 20);
			label[i].setForeground(Color.MAGENTA);
			c.add(label[i]);
		}
				
		this.setSize(300, 300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Q6();
	}
}