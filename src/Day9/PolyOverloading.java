package Day9;

public class PolyOverloading {
    public static void main(String[] args) {
        Mathutil m=new Mathutil();
        int a=m.add(5,6);
        System.out.println(a);
        double b=m.add(3.4,6.8);
        System.out.println(b);
        int c=m.add(36,78,48);
        System.out.println(c);
        int d=m.add(33,3,2,2,8);
        System.out.println(d);
    }
}
class Mathutil{
    int add(int a,int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a,int b, int c){
        return a+b+c;
    }
    int add(int a, int b, int c, int d, int e){
        return a+b-c*d/e;
    }
}
