package Day9OopsRevise;

public class PolyOverride {
    public static void main(String[] args) {
        Cars c=new Cars();
        c.start();
        c.drive();
    }
}
class Vehicles{
    void start(){
        System.out.println("vehicle starting");
    }
}
class Cars extends Vehicles{
    @Override
    void start() {
        System.out.println("car starts");
    }
    void drive(){
        System.out.println("car driving");
    }
}