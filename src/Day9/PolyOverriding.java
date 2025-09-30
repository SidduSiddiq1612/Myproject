package Day9;

public class PolyOverriding {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        d.eat();
        Cat c=new Cat();
        c.eat();
        c.sound();
    }
}
//parent class
class Animal{
    void sound(){
        System.out.println("Animal can sound");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog can sound");
    }
    void eat(){
        System.out.println("Dog can eat");
    }
}
class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Cat sound meow");
    }
    void eat(){
        System.out.println("Cat eats");
    }
}