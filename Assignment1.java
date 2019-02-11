import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Assignment1
{
	Assignment1()
	{
		JFrame f=new JFrame("Student");

		JLabel l1=new JLabel("PRN");
		JLabel l2=new JLabel("Name");
		JLabel l3=new JLabel("City");

		JTextField t1=new JTextField();
		JTextField t2=new JTextField();
		JTextField t3=new JTextField();
		
		t1.setBounds(100,50,150,20);
		t2.setBounds(100,100,150,20);
		t3.setBounds(100,150,150,20);

		l1.setBounds(50,50,150,20);
		l2.setBounds(50,100,150,20);
		l3.setBounds(50,150,150,20);

		JButton b1=new JButton("Submit");
		b1.setBounds(100,200,95,30);
		
		f.add(l1);f.add(t1);
		f.add(l2);f.add(t2);
		f.add(l3);f.add(t3);
		f.add(b1);		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String prn=t1.getText();
				String name=t2.getText();
				String city=t3.getText();
				JOptionPane.showMessageDialog(f,"Prn No :  " + prn+"\nName : "+name+"\nCity : "+city);
			}
		});			
	}
	public static void main(String str[])
	{
		new Assignment1();
	}
}

