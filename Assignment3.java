import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Assignment3
{
	Assignment3()
	{
		JFrame f=new JFrame("Calculation");

		JLabel l1=new JLabel("Number 1");
		JLabel l2=new JLabel("Number 2");
		JLabel l3=new JLabel("Number 3");

		JTextField t1=new JTextField();
		JTextField t2=new JTextField();
		JTextField t3=new JTextField();
				
		t1.setBounds(130,50,150,20);
		t2.setBounds(130,100,150,20);
		t3.setBounds(130,150,150,20);
		
		l1.setBounds(50,50,150,20);
		l2.setBounds(50,100,150,20);
		l3.setBounds(50,150,150,20);

		JButton b1=new JButton("Addition");
		JButton b2=new JButton("Multipliction");
		JButton b3=new JButton("Substraction");

		b1.setBounds(50,200,115,30);
		b2.setBounds(150,200,115,30);
		b3.setBounds(250,200,115,30);
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=Integer.parseInt(t3.getText());
				int sum=a+b+c;
				JOptionPane.showMessageDialog(f,"Record Inserted Into Table");
			}
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=Integer.parseInt(t3.getText());
				int mul=a*b*c;
				JOptionPane.showMessageDialog(f,"Multiplication of Numbers is : "+String.valueOf(mul));
			}
		});
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=Integer.parseInt(t3.getText());
				int sub=a-b-c;
				JOptionPane.showMessageDialog(f,"Substraction of Numbers is : "+String.valueOf(sub));
			}
		});
		f.add(l1);f.add(t1);
		f.add(l2);f.add(t2);
		f.add(l3);f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);	
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);			
	}
	public static void main(String str[])
	{
		new Assignment3();
	}
}

