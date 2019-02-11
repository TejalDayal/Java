import javax.swing.*;
import java.awt.event.*;

public class Demoframe extends JFrame implements ActionListener{
  JLabel jl;
  JButton jb;
  JPanel jp;
  JTextField tf,tf2;
public Demoframe(String str) {
super(str);
jp=new JPanel();
jl=new JLabel("Enter Name");
jb=new JButton("Click");
tf=new JTextField(10);
tf2=new JTextField(10);
jb.addActionListener(this);
jp.add(jl);
jp.add(tf);
jp.add(jb);
jp.add(tf2);
this.add(jp);
}
public void actionPerformed(ActionEvent ae){
  String s=tf.getText();
  s="Hello "+s;
  tf2.setText(s);

}
public static void main(String args[])
{
  JFrame f=new Demoframe("Demo Swing");
  f.setSize(200,200);
  f.setVisible(true);
}
}
