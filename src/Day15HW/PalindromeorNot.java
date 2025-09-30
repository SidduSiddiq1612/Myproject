package Day15HW;
import java.util.Scanner;
public class PalindromeorNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=sc.nextInt();
        int rev=0;
        int t=num;
        while(t>0){
            int rem=t%10;
            rev=rev*10+rem;
            t/=10;
        }
        System.out.println(rev);
        if(rev==num){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}
