//Create a javaframe to accept 2 integer numbers from user. requires 2 text fields.
//it has 4 buttons- name as Add,Subtract,Multiply,Divide


import javax.swing.*;
import java.awt.event.*;

public class Demoframe1 extends JFrame implements ActionListener{
  JLabel jl,jl1;
  JButton jb,jb1,jb2,jb3;
  JPanel jp;
  JTextField tf,tf2;
public Demoframe1(String str) {
super(str);
jp=new JPanel();
jl=new JLabel("Enter First Number");
jl1=new JLabel("Enter Second Number");
jb=new JButton("Add");
jb1=new JButton("Subtract");
jb2=new JButton("Multiply");
jb3=new JButton("Divide");
tf=new JTextField(10);
tf2=new JTextField(10);
jb.addActionListener(this);
/*jp.add(jl);
jp.add(jl1);
jb.add(tf);
jb1.add(tf);
jb2.add(tf);
jb3.add(tf);*/
jp.add(jb);
jp.add(jb1);
jp.add(jb2);
jp.add(jb3);
jp.add(tf2);
this.add(jp);
}
public void actionPerformed(ActionEvent ae){
  //String bn=ae.getActionCommand;
  String s=tf.getText();
  /*if(bn.equals("Add"))
  {
  s="Hello"+s;
  }
  if(bn.equals("OK"))
  {
  s="Hi"+s;
}*/
}
public static void main(String args[])
{
  JFrame f=new Demoframe("Demo Swing");
  f.setSize(200,200);
  f.setVisible(true);
}
}
