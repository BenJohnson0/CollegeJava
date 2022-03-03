package Examples;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.lang.Math; 

public class firstGUI extends JFrame implements ActionListener
{
	//attributes
	int count;
	JButton button1, button2, button3;
	JPanel panel1, panel2, panel3;
	JLabel label1;
	int guess;
	JTextField guess_entry;
	
	//methods
	public firstGUI(String title)
	{
		super(title);
		setVisible(true);
		setSize(400, 300);
		setLayout(new FlowLayout());
		
		//generate random number
		panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		add(panel1);
		
		button1 = new JButton("Generate a random number");
		panel1.add(button1);
		button1.setToolTipText("This button will generate a random number");
		button1.addActionListener(this);
		
		//enter guess
		panel2 = new JPanel();
		add(panel2);
		panel2.setLayout(new FlowLayout());
		
		label1 = new JLabel("Then make a guess");
		panel2.add(label1);
		
		guess_entry = new JTextField("Enter your guess");
		panel2.add(guess_entry);
		
		//check if it is correct
		panel3 = new JPanel();
		add(panel3);
		panel3.setLayout(new FlowLayout());
		
		button3 = new JButton("Check your guess");
		panel3.add(button3);
		button3.setToolTipText("Check if you are correct!");
		button3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		int random_val = 0;
		
		if(e.getSource() == button1)
		{
			int min = 0;
			int max = 100;
			random_val = (int)(Math.random()*(max-min+1)+min);
			System.out.println(random_val);
		}
		
		
		else if(e.getSource() == button3)
		{
			guess = Integer.parseInt(guess_entry.getText());
			
			if(guess > random_val)
			{
				JOptionPane.showMessageDialog(JFrame, "Too High!");
			
				if(random_val == guess)
				{
					System.out.print("You win!");
				}
				else
				{
					System.out.print("Try again!");
				}
			}
			else
			{
				System.out.print("Enter a number between 0-100");
			}
		}
	}
}