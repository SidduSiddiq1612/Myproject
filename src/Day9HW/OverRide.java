package Day9HW;

public class OverRide {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.drive();
    }
}
class Vehicle{
    void start(){
        System.out.println("vehicle is starting");
    }
}
class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Car is Audi");
    }
        void drive(){
            System.out.println("car driving");
        }
}

