package Day14HW;
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> a1=new ArrayList<>();
        //add elements into arraylist
        a1.add("abhi");
        a1.add("gill");
        a1.add("surya");
        a1.add("tilak");
        a1.add("sanju");
        a1.add("dube");
        a1.add("hardik");
        a1.add("axar");
        a1.add("bumrah");
        a1.add("varun");
        System.out.println(a1);
        Iterator<String> iterator= a1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for(String num : a1){
            System.out.println(num);
        }


        //Add an element at a specific index
        a1.add(7,"kuldeep"); //add kuldeep at index 7
        System.out.println(a1);
        //Remove an element from the ArrayList, Remove at an index
        a1.remove("gill"); //remove gill
        System.out.println(a1);
        a1.remove(5);   //remove index 5(hardik)
        System.out.println(a1);
        //size of arraylist
        System.out.println(a1.size());
        //Get an element at a particular index
        System.out.println(a1.get(7)); //get bumrah at index 7
        //update an element at a particular index
        a1.set(5,"jitesh");
        System.out.println(a1);
        //Check the given element is present in the ArrayList
        System.out.println(a1.contains("dube"));
        //Remove all elements of the ArrayList
        System.out.println(a1.removeAll(a1));
        System.out.println(a1);
    }
}
