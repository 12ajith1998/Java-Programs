import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class PanelDemo extends JFrame
{
JTabbedPane p1;
JPanel p2;
JLabel firstName,lastName;
JTextField firstn1,secondn1;
public PanelDemo()
{
p2=new JPanel();
firstName=new JLabel("First Name:");
p2.add(firstName);
firstn1=new JTextField();
firstn1.setText("Jones");
p2.add(firstn1);
lastName=new JLabel("Last Name:");
p2.add(lastName);
secondn1=new JTextField();
secondn1.setText("nithya");
p2.add(secondn1);
p1=new JTabbedPane(JTabbedPane.BOTTOM);
p1.addTab("Tab1",null);
p1.addTab("Tab2",null);
p1.addTab("Tab3",null);
p1.setSize(100,100);
setTitle("JTabbedPanel Demo");
setVisible(true);
setSize(300,200);
add(p2);
}
public static void main(String[] args)
{
PanelDemo obj=new PanelDemo();
}
}