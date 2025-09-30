package Day6;
import java.util.Scanner;
public class FactorialofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long result = factorial(n);
        if(result!=-1){
            System.out.println("The factorial of " + n + " is " + result);
        }
    }
    static long factorial(int n) {
        if (n < 0) {
            System.out.println("please enter positive number.");
            return -1;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
