import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class Assignment2
{
	Assignment2()
	{
		JFrame f=new JFrame("Student");

		JLabel l1=new JLabel("PRN");
		JLabel l2=new JLabel("Name");
		JLabel l3=new JLabel("City");

		JTextField t1=new JTextField(17);
		JTextField t2=new JTextField(17);
		JTextField t3=new JTextField(17);
		
		JButton b1=new JButton("Submit");
				
		f.add(l1); f.add(t1);
		f.add(l2); f.add(t2);
		f.add(l3); f.add(t3);
		f.add(b1);	
		
		String column[]={"ID","NAME","SALARY"};
		DefaultTableModel dm=new DefaultTableModel(column,0);         
    		JTable j=new JTable(dm);   
		JScrollPane sp=new JScrollPane(j);              
    		f.add(sp); 	
	
		f.setSize(500,500);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String prn=t1.getText();
				String name=t2.getText();
				String city=t3.getText();

				String[] item={prn,name,city}; 
				dm.addRow(item);
				    	
				t1.setText("");	
				t2.setText("");
				t3.setText("");			
			}
		});			
	}
	public static void main(String str[])
	{
		new Assignment2();
	}
}

