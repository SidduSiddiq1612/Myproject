package Day15HW;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
public class EqualorNotequal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        System.out.println("Enter c: ");
        int c=sc.nextInt();
        System.out.println("a==b: " +(a==b));
        System.out.println("a!=b: " +(a!=b));
        System.out.println("a==c: " +(a==c));
    }
}
