package Day17HW;
public class Inheritences {
    public static void main(String[] args) {
        A a1=new A();
        a1.plants();
        a1.animals();
        a1.human();
        B b1=new B();
        b1.Bat();
        b1.Ball();
        b1.human();
        C c1=new C();
        c1.raid();
        c1.defend();
        c1.human();
    }
}
class A{
    void plants(){
        System.out.println("plants give oxygen");
    }
    void animals(){
        System.out.println("dog is an animal");
    }
    void human(){
        System.out.println("we are human");
    }
}
class B extends A{
    void Bat(){
        System.out.println("Batsman in cricket");
    }
    void Ball(){
        System.out.println("Bowler in cricket");
    }
    @Override
    void human(){
        System.out.println("humans can play cricket");
    }
}
class C extends B {
    void raid() {
        System.out.println("raiding in kabaddi");
    }

    void defend() {
        System.out.println("defending in kabaddi");
    }

    @Override
    void human() {
        System.out.println("humans can play kabaddi ");
    }
}