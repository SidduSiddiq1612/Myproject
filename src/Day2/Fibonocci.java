package Day2;

import java.util.Scanner;
public class Fibonocci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of terms: ");
        int n=sc.nextInt();
        if(n<0){
            System.out.print("Enter positive value");
        }
        int firstterm=0;
        int secondterm=1;
        int i=0;
        while(i<=n){
            System.out.print(firstterm +" ");
            int nextterm=firstterm+secondterm;
            firstterm=secondterm;
            secondterm=nextterm;
            i++;
        }
    }


}
