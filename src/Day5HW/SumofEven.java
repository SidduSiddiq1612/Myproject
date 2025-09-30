package Day5HW;
import java.util.Scanner;
public class SumofEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i+=2){
            sum=sum+i;
        }
        System.out.print(sum);
    }
}
