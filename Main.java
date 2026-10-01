import java.util.Scanner;

public class Main{

    public static void main(String [] args){
    Scanner MyObject = new Scanner(System.in);

    String input = MyObject.nextLine();
    for (int i=0; i<input.length(); i++) System.out.println(input.charAt(i));
    }
}
