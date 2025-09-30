package Day3;
import java.util.Scanner;
public class PrintPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=sc.nextInt();
        for(int i=2;i<=num;i++){
            boolean isPrime=true;
            for(int j=2; j*j<=i; j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i +" ");
            }
        }
    }
}
