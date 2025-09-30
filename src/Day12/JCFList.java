package Day12;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
public class  JCFList {
    public static void main(String[] args) {
        //Array List
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(5);
        l1.add(3);
        l1.add(1);
        l1.add(7);
        System.out.println(l1);
        System.out.println(l1.get(2));
        System.out.println(l1.remove(2));
        System.out.println(l1.contains(6));
        l1.set(2,6);
        System.out.println(l1);
        //Linked List
        LinkedList<Integer> LL1=new LinkedList<>();
        LL1.add(1);
        LL1.add(2);
        LL1.add(3);
        LL1.add(4);
        LL1.add(5);
        LL1.add(5);
        System.out.println(LL1);
        LL1.addFirst(10);
        LL1.addLast(20);
        System.out.println(LL1);
        LL1.add(3,50);
        System.out.println(LL1);
        System.out.println(LL1.get(2));
        System.out.println(LL1.getFirst());
        System.out.println(LL1.size());
        System.out.println(LL1.removeFirstOccurrence(2));
        System.out.println(LL1);
        //Vectors
        Vector<String> v1=new Vector<>();
        v1.add("hello");
        v1.add("e");
        System.out.println(v1);
        //Stack
        Stack<Integer> s1=new Stack<>();
        s1.push(6);
        s1.push(3);
        s1.push(7);
        System.out.println("stack" +s1);
        s1.pop();
        System.out.println(s1);
        System.out.println(s1.peek());
    }
}
