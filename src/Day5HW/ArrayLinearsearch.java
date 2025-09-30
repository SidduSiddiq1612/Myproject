package Day5HW;
import java.util.Scanner;
public class ArrayLinearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num to check: ");
        int num=sc.nextInt();
        int i;
        int[] arr={24,57,53,25,85,11,7};
        for(i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.print("The index of num is: "+i);
                break;
            }
        }
        if(i==arr.length){
            System.out.print("not found");
        }

    }
}
