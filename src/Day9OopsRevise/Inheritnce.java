package Day9OopsRevise;

public class Inheritnce {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.sound();
        d1.sleep();
        d1.bark();
        Car c=new Car();
        c.start();
        c.drive();
        Bike b=new Bike();
        b.start();
        b.ride();
        Man m=new Man();
        m.sleep();
        m.sound();
        m.greet();
        m.wish();
    }
}
//single and multilevel inheritance
class Animal{
    void sound(){
        System.out.println("Animal can sound");
    }
}
class Mammal extends Animal{
    void sleep(){
        System.out.println("Mammal can sleep");

    }
}
class Dog extends Mammal{
    void bark(){
        System.out.println("Dog can bark");

    }
}
//Hierarachal inheritance
class Vehicle{
    void start(){

        System.out.println("Vehicle can start");
    }
}
class Car extends Vehicle{
    void drive(){

        System.out.println("Car can drive");
    }
}
class Bike extends Vehicle{
    void ride(){

        System.out.println("Bike can ride");
    }
}
//interfaces
interface Animals{
    void sleep();
    void sound();
}
interface Hello{
    void greet();
    void wish();
}
class Man implements Animals,Hello{
    public void sleep(){

        System.out.println("Man can sleep");
    }
    public void sound(){
        System.out.println("Man can sound");
    }
    public void greet(){

        System.out.println("Man can greet");
    }
    public void wish(){

        System.out.println("Man can wish");
    }
}
