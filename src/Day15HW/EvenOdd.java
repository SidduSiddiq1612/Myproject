package Day15HW;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=sc.nextInt();
        //print even numbers
        for(int i=0;i<=num;i+=2){
            //if(i%2==0){
                System.out.println(i +" ");
            //}
        }
        //print odd numbers
        for(int j=0;j<=num;j++){
            if(j%2!=0){
                System.out.print(j +" ");
            }
        }
    }
}
