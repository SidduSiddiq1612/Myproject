package Day9OopsRevise;

public class PolyOverload {
    public static void main(String[] args) {
        Mathutil m=new Mathutil();
        int a=m.add(3,6);
        System.out.println(a);
        double b=m.add(0.4,6.3);
        System.out.println(b);
        int c=m.add(53,2,73,23,2);
        System.out.println(c);
    }
}
class Mathutil{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    int add(int a, int b, int c, int d, int e){
        return a+b-c*d/e;
    }

}