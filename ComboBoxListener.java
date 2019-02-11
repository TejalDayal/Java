package arraystack;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ComboBoxListener {

    HashMap hmMappingOfNextField = new HashMap();
    HashMap hm1and2and3mapping = new HashMap();


    public static void main(String[] args) {
        ComboBoxListener obj = new ComboBoxListener();
        obj.addComboBox();
    }

    public void addComboBox()
    {
        String[] cb1Arr = {"Select","india", "usa", "australia"};

        JFrame frame = new JFrame("Check Combo box events");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JComboBox cb1 = new JComboBox(cb1Arr);
        cb1.setName("cb1");
        final JComboBox cb2 = new JComboBox();
        cb2.setName("cb2");
        final JComboBox cb3 = new JComboBox();
        cb3.setName("cb3");

        JPanel panel = new JPanel();
        panel.add(cb1);
        panel.add(cb2);
        panel.add(cb3);



        hmMappingOfNextField.put("cb1", cb2);
        hmMappingOfNextField.put("cb2", cb3);
        hmMappingOfNextField.put("cb3", null);

        hm1and2and3mapping.put("Select", new String[]{"Select"});
        hm1and2and3mapping.put("india", new
String[]{"Select","maharashtra", "karnataka", "gujarat"});
        hm1and2and3mapping.put("usa", new
String[]{"Select","washington", "california", "boston"});
        hm1and2and3mapping.put("australia", new
String[]{"Select","queensland", "victoria", "tasmania"});

        hm1and2and3mapping.put("Select", new String[]{"Select"});
        hm1and2and3mapping.put("maharashtra", new
String[]{"Select","mumbai", "pune", "karad"});
        hm1and2and3mapping.put("karnataka", new
String[]{"Select","mysore", "banglore", "hampi"});
        hm1and2and3mapping.put("gujarat", new
String[]{"Select","surat", "bharuch", "anand"});

        hm1and2and3mapping.put("Select", new String[]{"Select"});
        hm1and2and3mapping.put("washington", new
String[]{"Select","newyork", "dtroit", "michigan"});
        hm1and2and3mapping.put("california", new
String[]{"Select","los angelos", "san francisco", "alaska"});
        hm1and2and3mapping.put("boston", new
String[]{"Select","niagara", "texas", "pennstate"});

        hm1and2and3mapping.put("Select", new String[]{"Select"});
        hm1and2and3mapping.put("queensland", new
String[]{"Select","brisbane", "longreach", "mackay"});
        hm1and2and3mapping.put("victoria", new
String[]{"Select","melbourne", "hamilton", "morwell"});
        hm1and2and3mapping.put("tasmania", new
String[]{"Select","perth", "hobart", "swansea"});


        final ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                JComboBox cb = (JComboBox)event.getSource();


                String cbNameOnWhichEventIsFired = cb.getName();

System.out.println("cbNameOnWhichEventIsFired===="+cbNameOnWhichEventIsFired);

                Object cbObjToBeUpdated =
hmMappingOfNextField.get(cbNameOnWhichEventIsFired);
                JComboBox cbToBeUpdated = (JComboBox)cbObjToBeUpdated;

                String cbSelectedItem= (String)cb.getSelectedItem();
                if( cbSelectedItem != null)
                {
                    String[] mapppingArr =
(String[])hm1and2and3mapping.get(cbSelectedItem);
                    System.out.println(Arrays.asList(mapppingArr));

                    cbToBeUpdated.removeAllItems();
                    for(int i=0; i<mapppingArr.length; i++)
                    {
                        cbToBeUpdated.addItem(mapppingArr[i]);
                    }
                }


            }
        };


        cb1.addActionListener(listener);
        cb2.addActionListener(listener);

        frame.add(panel, BorderLayout.NORTH);
        frame.setSize(700, 400);
        frame.setVisible(true);
    }
}
