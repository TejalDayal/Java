import javax.swing.*;
import java.awt.event.*;

public class Jcombonew extends JFrame implements ItemListener {
JPanel jp;
JComboBox jbx;
//JButton jb;
JLabel jl;
public Jcombonew(String str)
{
    super(str);
            jp=new JPanel();
            jbx=new JComboBox();
            //jb=new JButton("Click");
            jbx.addItem("C++");
            jbx.addItem("Java");
            jbx.addItem("C");
            jbx.addItem("C#");
            jl=new JLabel();
            jbx.addItemListener(this);
            jp.add(jbx);
            //jp.add(jb);
            jp.add(jl);
            this.add(jp);
            
}

public void itemStateChanged(ItemEvent ae){ 
        String s=(String) jbx.getItemAt(jbx.getSelectedIndex());
        jl.setText(s);
}
    public static void main(String[] args) {
       JFrame jf=new Jcombonew("ComboDemo");
       jf.setSize(300,300);
       jf.setVisible(true);
    }
    
}
