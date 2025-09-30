package Day15HW;
import java.util.Scanner;
public class ArmstrongOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num: ");
        int num=sc.nextInt();
        int armstrong=0;
        int t=num;
        String str=String.valueOf(num);
        int length=str.length();
        System.out.println(length);
        while(t>0){
            int temp=t%10;
            int digit=1;
            for(int i=0;i<length;i++) {
                digit *= temp;
            }
            armstrong+=digit;
            t=t/10;
        }
        if(armstrong==num){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}
