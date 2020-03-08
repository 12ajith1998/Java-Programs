import javax.swing.JFrame;
import javax.swing.JDialog;
public class FrameDemo 
{
JFrame obj;
JDialog d1;
public FrameDemo()
{
obj=new JFrame();
obj.setTitle(" Frame Demo Title");
obj.setVisible(true);
obj.setSize(300,300);
d1=new JDialog();
d1.setTitle(" Frame dialog demo");
d1.setVisible(true);
d1.setSize(300,150);
}
public static void main(String[] args)
{
FrameDemo fobj=new FrameDemo();
}
}
