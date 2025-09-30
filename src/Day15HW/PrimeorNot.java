package Day15HW;
import java.util.Scanner;
public class PrimeorNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count+=1;
            }
        }
        if(count==2){
            System.out.println("prime number");
        }
        else{
            System.out.println("not prime");
        }

    }
}
