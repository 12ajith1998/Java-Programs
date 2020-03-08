import java.util.Scanner;
public class Hangman1 {
public void showMenu()
{
int option;
Scanner sc = new Scanner(System.in);
System.out.println("-----Menu-----");
System.out.println("1.Play");
System.out.println("2.Instructions");
System.out.println("3.Exit");
System.out.println("\n Choose the option:");
option=sc.nextInt();
}
public static void main(String[] args)
{
Hangman1 hg = new Hangman1();
hg.showMenu();
}
}