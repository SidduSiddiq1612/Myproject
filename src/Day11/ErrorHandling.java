package Day11;

public class ErrorHandling {
    public static void main(String[] args) {
        try{
            String a="hello";
            System.out.println(a.charAt(6));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try{
            int a=10;
            int b=a/0;
            System.out.println(b);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            for(int i=1;i<0;i++){
                System.out.println(i);
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        System.out.println("hi");


    }
}
