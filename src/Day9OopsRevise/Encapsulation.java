package Day9OopsRevise;

public class Encapsulation {
    public static void main(String[] args) {
        students s1=new students("siddiq", 8);
        System.out.println(s1.getName());
        System.out.println(s1.a);
        System.out.println(s1.getAge());
    }
}
class students{
    private String name;
    private int age;
    int a=10;
    public String getName(){
        return name;
    }
    public students(String name, int age){
        this.name=name;
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
