package Day15;

public class Generic {
    public static void main(String[] args) {
        //object of class
        Box<String> g1=new Box<>();
        g1.setValue("hello");
        System.out.println(g1.getValue());

        Box<Integer> g2=new Box<>();
        g2.setValue(100);
        System.out.println(g2.getValue());

        Box<Double> g3=new Box<>();
        g3.setValue(100.86);
        System.out.println(g3.getValue());
    }
}
class Box<T>{
    private T value;
    int a;
    public void setValue(T value){
        this.value=value;
    }
    public T getValue(){
        return value;
    }
}
