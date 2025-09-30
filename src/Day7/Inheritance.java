package Day7;

public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.walk();
        d1.bark();
        Car c=new Car();
        Bike b=new Bike();
        c.start();
        c.drive();
        b.start();
        b.ride();
        Dog1 d=new Dog1();
        d.sleep();
        d.sound();
        d.greet();
        d.wish();
    }
}
     // SINGLE AND MULTILEVEL INHERITANCE
    //Base class
    class Animal{
        void eat(){
            System.out.println("Animal can eat");
        }
    }
    //Derived class(Inherit from Animal)
    class Mammal extends Animal{
        void walk() {
            System.out.println("Mammal can walk");
        }
    }
    //Derived class(Inherit from Mammal)
    class Dog extends Mammal{
        void bark() {
            System.out.println("Dog can bark");
        }
    }
    //HIERARICHAL INHERITANCE
    class Vehicle{
        void start(){
            System.out.println("Vehicle is starting");
        }
    }
    class Car extends Vehicle{
        void drive(){
            System.out.println("Car is driving");
        }
    }
    class Bike extends Vehicle{
        void ride(){
            System.out.println("Bike is driving");
        }
    }
    //Interface
    interface Animals {
        void sleep();

        void sound();
    }
    interface Hello{
        void greet();
        void wish();
    }
    class Dog1 implements Animals, Hello{
        public  void sound(){
            System.out.println("Dog barking");
        }
        public void sleep(){
            System.out.println("Dog can sleep");
        }
        public void greet(){
            System.out.println("Happy greetings");
        }
        public void wish(){
            System.out.println("wishing you");
        }

    }




