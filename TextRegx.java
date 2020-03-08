import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class TextRegx
{
public static void main(String[] args)
{
String text="when in Rome, do as the Romans some other Roman";
String textSplit[]=text.split(" ");
Pattern myp=Pattern.compile("Ro.+");
for(int i=0;i<textSplit.length;i++)
{
Matcher mym1=myp.matcher(textSplit[i]);
boolean myBoolean=mym1.matches();
System.out.println(myBoolean);
}
}
}