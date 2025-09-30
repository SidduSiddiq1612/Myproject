package Day14;
import java.util.*;
public class queues {
    public static void main(String[] args) {
        //LinkedList
        Queue<String> q1=new LinkedList<>();
        q1.add("a");
        q1.add("b");
        q1.add("c");
        q1.offer("d");
        q1.offer("5");
        System.out.println(q1);
        q1.remove(); //removes first element
        System.out.println(q1);
        q1.poll();  //removes first element
        System.out.println(q1);
        System.out.println(q1.element());  //returns first element
        System.out.println(q1.peek());  //returns 1st element
        //PriorityQueue //same methods
        Queue<Integer> q2=new PriorityQueue<>();
        q2.add(2);
        q2.add(3);
        q2.add(4);
        System.out.println(q2);


    }
}
