package Day15HW;
import java.util.Scanner;
public class SwitchEvenorOdd{
    public static void main(String[] args) {
        //Program to check whether a number is EVEN or ODD using switch
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=sc.nextInt();
        switch (num%2){
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;
        }
    }
}
