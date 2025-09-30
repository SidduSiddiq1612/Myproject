package Day5HW;
import java.util.Scanner;
public class Details {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=sc.next();
        System.out.print("Enter age: ");
        int age=sc.nextInt();
        System.out.print("Enter city: ");
        String city=sc.next();
        System.out.println("My name is: " +name);
        System.out.println("My age is: " +age);
        System.out.println("My city is: " +city);

    }
}
