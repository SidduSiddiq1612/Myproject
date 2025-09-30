package Day1;

import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks=sc.nextInt();
        if(marks>=90 && marks<=100)
        {
            System.out.print("Day1.Grade: A");
        }
        else if(marks>=80 && marks<=89)
        {
            System.out.print("Day1.Grade: B");
        }
        else if(marks>=70 && marks<=79)
        {
            System.out.print("Day1.Grade: C");
        }
        else if(marks>=60 && marks<=69)
        {
            System.out.print("Day1.Grade: D");
        }
        else if(marks>=0 && marks<60 ){
            System.out.print("Day1.Grade F");
        }
        else {
            System.out.print("Invalid marks");
        }
    }
}
