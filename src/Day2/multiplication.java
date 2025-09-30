package Day2;

import java.util.Scanner;
public class multiplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int j=11;
        for(int i=1;i<=10;i++){
            System.out.println(num +" X " +i +" = " +(num*i));
        }
        while(j<=20){


            System.out.println(num*j);
            j++;
        }

    }
}
