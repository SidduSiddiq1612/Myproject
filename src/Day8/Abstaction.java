package Day8;

public class Abstaction {
    public static void main(String[] args) {
        AB1 a=new AB1();
        a.hello();
        a.greet();
        AB2 b=new AB2();
        b.hello();
        b.greet();
    }
}
abstract class abstractClass{
    abstract void hello();
    abstract void greet();
}
class AB1 extends abstractClass{
    void hello(){
        System.out.println("hello this is abstract class");
    }
    void greet(){
        System.out.println("hello how r u");
    }
}
class AB2 extends abstractClass{
    void hello(){
        System.out.println("iam learning abstract class");
    }
    void greet(){
        System.out.println("hello iam fine");
    }
}