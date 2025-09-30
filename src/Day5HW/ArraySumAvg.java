package Day5HW;
public class ArraySumAvg {
    public static void main(String[] args) {
        int[] numbers={4,5,3,7,2,8,9};
        float avg=0;
        float sum=0;
        int length=numbers.length;
        for(int num: numbers){
            sum+=num;
        }
        avg=sum/length;
        System.out.println("The avg is: " +avg);
        System.out.print("The sum is: " +sum);
    }
}
