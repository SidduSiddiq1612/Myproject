package Day1;

import java.util.Scanner;
public class Day1{
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("hi there");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        System.out.println("Your age is: " +age);
        if(age>=18)
        {
            if(age>=60)
            {
                System.out.println("He is a senior citizen");
            }
            else{
                System.out.println("He is a major");
            }

        }
        else {
            System.out.println("He is a minor");
        }
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=in.nextInt();
        switch(num){
            case 1:
                System.out.print("he enter one");
                break;
            case 2:
                System.out.print("he enter two");
                break;
            case 3:
                System.out.print("he enter three");
                break;
            case 4:
                System.out.print("he enter four");
                break;

        }

    }
}