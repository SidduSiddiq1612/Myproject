package Day4;

public class Array {
    public static void main(String[] args) {
        //Array declaration
        int[] arr={1,4,5,67,2};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        //Declaration+Creation
        int[] num1=new int[10];
        for(int i=0;i<10;i++){
            num1[i]=i;
        }
        for(int num:num1){
            System.out.println(num);
        }
        //2D Array Declaration
        int[][] twoDArray={{1,2,3},{3,4,5},{5,6,7}};
        System.out.println("the no. of rows are:" +twoDArray.length);
        System.out.println("the no. of cols are:" +twoDArray[0].length);
        for(int i=0;i<twoDArray.length;i++){
            for(int j=0;j<twoDArray[i].length;j++){
                System.out.print(twoDArray[i][j] +" ");
            }
            System.out.println();
        }
        // 3D Array Declaration
        int[][][] threeDArray={
                {{9,7,5},{4,5,3},{3,2,7}},
                {{3,4,1},{2,8,0},{1,9,4}},
                {{2,4,5},{4,2,0},{1,9,7}}
        };
        System.out.println("the length of 3darray: " +threeDArray.length);
        for(int i=0;i< threeDArray.length;i++){
            for(int j=0;j< threeDArray[i].length;j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print (threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
