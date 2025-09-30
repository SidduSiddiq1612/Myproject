package Day2;

import java.util.Scanner;
class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num= sc.nextInt();
        int count=0;
        int[] arr=new int[num];
        for(int j=1;j<=num;j++){

            for(int i = 1; i <= j; i++){

                if (j%i==0) {
                    count=count+1;
                }
            }
            System.out.print(count);
            if(count==2){
                arr[j]=j;
                count=0;
            } else {
                System.out.println(num +" is Not a prime");
            }
        }



    }
}
