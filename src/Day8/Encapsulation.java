package Day8;

public class Encapsulation {
    public static void main(String[] args) {
        students s1=new students();
        s1.setName("siddiq");
        String name=s1.getName();
        System.out.println(name);
        System.out.println(s1.a);
        s1.setAge(5);
        System.out.println(s1.getAge());
    }
}
class students{
    private String name;
    private int age;
    int a=10;
    //Public getter method for name
    public String getName(){
        return name;
    }
    //public setter method for name
    public void setName(String name){
        this.name=name;
    }
    //public getter method for age
    public int getAge(){
        return age;
    }
    //public setter method for age
    public void setAge(int age){
        if(age>=0){
            this.age=age;
        }
        else{
            System.out.println("enter valid age");

        }
    }

}