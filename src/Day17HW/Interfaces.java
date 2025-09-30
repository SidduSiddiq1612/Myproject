package Day17HW;
public class Interfaces {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        drive a=new drive();
        a.bike();
        Hi b=new Hi();
        b.wish();
        Happy c=new Happy();
        c.Apple();
        c.Bat();
        Bye z=new Bye();
        z.hey();
        s obj=new s();
        obj.s();
        obj.run();
        game g=new game();
        g.start();
        g.stop();
        System.out.println(constant.NAME);
        System.out.println(constant.NUMBER);
        MyClass h=new MyClass();
        h.printMessage();
        h.showVersion();
    }
}
//Create an interface with only one method and implement it in a class. Call the method
//implemented.
interface Animal{
    void sound();
}
class Dog implements Animal{
    public void sound() {
        System.out.println("dog sound like bow bow");
    }
}
//Create an interface with two methods, but implement only one in a class. Call the
//method implemented.
interface Vehicle{
    void bike();
    void car();
}
class drive implements Vehicle{
    public void bike() {
        System.out.println("riding the bike");
    }
    public void car() {
    }
}
//Use Interface instances to call the implemented method in the implemented class
interface Hello{
    void wish();
}
class Hi implements Hello{
    @Override
    public void wish() {
        System.out.println("good wishes");
    }
}
//Create two interfaces with one method each. Implement these two interfaces in one
//class.
interface Aa{
    void Apple();
}
interface Bb{
    void Bat();
}
class Happy implements Aa,Bb{
    public void Apple() {
        System.out.println("A for apple");
    }
    public void Bat() {
        System.out.println("B for ball");
    }
}
//Create two interfaces with the same method (same signature) in both the interfaces.
//Implement these two interfaces in one class. Call the method.
interface X{
    void hey();
}
interface Y{
    void hey();
}
class Bye implements X,Y{
    public void hey() {
        System.out.println("Hey everyone");
    }
}
//Create an interface with a default method and implement it in a class. Do not provide
//implementation to the default method and call the method.
interface Race{
    default void run(){
        System.out.println("run fast");
    }
}
class s implements Race{
    public void s(){
        System.out.println("run slow");
    }
}
//Create an interface and inherit it from the other interface
interface start{
    void start();
}
interface task extends start{
    void stop();
}
class game implements task{
    public void start() {
        System.out.println("game starts now");
    }
    public void stop() {
        System.out.println("game stops now");
    }
}
//Create an interface with static final variable
interface constant{
    public static final String NAME="kohli";
    public static final int NUMBER=18;
}
/*Create a PUBLIC interface with fields and methods, fields should have values assigned.
Implement this interface to some class and print the values of the interface fields and
 call the interface methods*/
interface MyInterface {
    String MESSAGE = "Hello MyInterface";
    int VERSION = 1;
    void printMessage();
    default void showVersion() {
        System.out.println(VERSION);
    }
}
class MyClass implements MyInterface {
    @Override
    public void printMessage() {
        System.out.println(MESSAGE);
    }
    @Override
    public void showVersion() {
        System.out.println(VERSION + ".0");
    }
}
//Create a PRIVATE or PROTECTED interface and print the values as above scenario
//Create an interface with private, public and protected fields.

