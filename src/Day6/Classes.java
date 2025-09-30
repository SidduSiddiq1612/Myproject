package Day6;
class show {
    // instance variable
    String name;
    int age;
    // global variable
    static int num = 128;
    // constructors
    show(String name, int age) {
        this.name = name; // s1.name =name
        this.age = age;
    }
    void hello(String hello, int val, int a) {
        // local variable
        int number;
        number = val + a;
        System.out.println(number);
        System.out.println(this.name + this.age);
        System.err.printf("hello world  hi %s and value %d...", hello, val);
    }
}
public class Classes {
    public static void main(String[] args) {
        show s1 = new show("raju", 20);
        s1.hello("jhon", 56, 43);
        System.out.println(s1.num);
        show s2 = new show("jhon", 20);
        s2.hello("hi", 34, 56);
        s2.age = 30;
        System.out.println(s2.num);
    }

}
