package Day9OopsRevise;
public class abstraction {
    public static void main(String[] args) {
        AB1 a=new AB1();
        a.greet();
        a.hello();
        AB2 b=new AB2();
        b.greet();
        b.hello();
    }
}
abstract class AbstractClass{
    abstract void hello();
    abstract void greet();
}
class AB1 extends AbstractClass{
    void hello(){
        System.out.println("hello AB1");
    }
    void greet(){
        System.out.println("greetings");
    }
}
class AB2 extends AbstractClass{
    void hello(){
        System.out.println("hello AB2");
    }
    void greet(){
        System.out.println("greetings AB2");
    }
}