import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class Assignment4
{
	Assignment4()
	{
		JFrame f=new JFrame("Student");

		JLabel l1=new JLabel("PRN");
		JLabel l2=new JLabel("Name");
		JLabel l3=new JLabel("City");

		JTextField t1=new JTextField(17);
		JTextField t2=new JTextField(17);
		JTextField t3=new JTextField(17);
		
		JButton b1=new JButton("Submit");
		
		JCheckBox c1=new JCheckBox("Singing");
		JCheckBox c2=new JCheckBox("Dancing");
		JCheckBox c3=new JCheckBox("Playing");
		
		String c[]={"MBA(IT)","MSC(CA)","MSC(SS)"};
		JComboBox cb=new JComboBox(c);

		JRadioButton r1=new JRadioButton("A) Male");    
		JRadioButton r2=new JRadioButton("B) Female");
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);bg.add(r2);		

		f.add(l1); f.add(t1);
		f.add(l2); f.add(t2);
		f.add(l3); f.add(t3);

		f.add(c1);f.add(c2);f.add(c3);	
		f.add(r1); f.add(r2);
		f.add(cb);
		f.add(b1);	
		
		String column[]={"ID","Name","Salary","Hobbies","Gender","Class"};
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
				
				String h1="";
				String h2="";
				String h3="";			
				String prn=t1.getText();
				String name=t2.getText();
				String city=t3.getText();
				String gender=bg.getElements().nextElement().getText();
				String fa=(String)cb.getItemAt(cb.getSelectedIndex());
				if(c1.isSelected())
				{
					 h1=c1.getText();
				}
				if(c2.isSelected())
				{
					h2=c2.getText();
				}
				if(c3.isSelected())
				{
					h3=c3.getText();
				}
				String hobby=h1+" "+h2+" "+h3;
				String[] item={prn,name,city,hobby,gender,fa}; 
				dm.addRow(item);
				    	
				t1.setText("");	
				t2.setText("");
				t3.setText("");

				JOptionPane.showMessageDialog(f,"Record Inserted into Table");			
			}
		});			
	}
	public static void main(String str[])
	{
		new Assignment4();
	}
}

