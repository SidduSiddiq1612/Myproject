package Day14HW;
import java.util.*;
public class hashset {
    public static void main(String[] args) {
        Set<String> s1=new HashSet<>();
        //add elements into hashset
        s1.add("apple");
        s1.add("banana");
        s1.add("grape");
        s1.add("mango");
        s1.add("guava");
        s1.add("orange");
        s1.add("pineapple");
        s1.add("watermelon");
        System.out.println(s1);
        //iterate or loop through elements
        for(String num: s1){
            System.out.println(num);
        }
        //size of a hashset
        System.out.println(s1.size());
        //Check the given element is present in the hashset
        System.out.println(s1.contains("grape"));
        //to check hashset isempty or not
        System.out.println(s1.isEmpty());
        System.out.println(s1.remove("guava"));
        System.out.println(s1);
        Set<String> s2=new HashSet<>();
        s2.add("lion");
        s2.add("tiger");
        s2.add("dog");
        s2.add("mango");
        s2.add("guava");
        s2.add("orange");
        s2.add("pineapple");
        System.out.println(s2);
        //add all elements of another collection
        System.out.println(s2.addAll(s1));
        System.out.println(s2);
        //checks s2 contains all elements of s1
        System.out.println(s2.containsAll(s1));
        //keeps only elements present in both sets
        System.out.println(s2.retainAll(s1));
        System.out.println(s2);
        //remove all of set
        System.out.println(s1.removeAll(s2));
        System.out.println(s1);
        System.out.println(s2);
        //removes all elements from set
        s2.clear();
        System.out.println(s2);
        //iterator
        //convert set to array
    }
}
