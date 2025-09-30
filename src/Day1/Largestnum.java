package Day1;

import java.util.Scanner;
public class Largestnum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1=sc.nextInt();
        System.out.print("Enter num2: ");
        int num2=sc.nextInt();
        System.out.print("Enter num3: ");
        int num3=sc.nextInt();
        if(num1>=num2 && num1>=num3)
        {
            System.out.print(num1 +" is largest");
        }
        else if(num2>=num1 && num2>=num3)
        {
            System.out.print(num2 +" is largest");
        }

        else{
            System.out.print(num3 +" is largest");
        }
    }
}
