package Day2;

public class Day2loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            if(i==8){
                break;
            }
            System.out.println("For loop "+i);

        }
        int j = 0;
        while (j < 10) {
            j++;
            if(j==5){
                continue;
            }
            if(j==8){
                break;
            }
            System.out.println("While loop " + j);

        }
        int k=0;
        do{
            System.out.println("Do while " +k);
            k++;
            if(k==4){
                break;
            }
        }
        while(k<=10);
        int[] numbers={1,2,34,56,7};
        for(int num:numbers){
            System.out.print(num +" ");
        }
    }
}
