package Day15HW;
import java.util.Scanner;
public class MaleorFemale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input: ");
        char letter=sc.next().charAt(0);
        System.out.println(Character.toUpperCase(letter));
        switch (Character.toUpperCase(letter)){
            case 'M':
                System.out.println("male");
                break;
            case 'F':
                System.out.println("female");
                break;
            default:
                System.out.println("enter valid input");
        }
    }
}
