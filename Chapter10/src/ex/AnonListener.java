package ex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonListener extends JFrame {
	public AnonListener() {
		setTitle("Anon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
			}
		});
		
		setSize(350,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AnonListener();
	}
}
