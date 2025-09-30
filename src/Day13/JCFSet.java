package Day13;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.*;

public class JCFSet {
    public static void main(String[] args) {
        HashSet<String> s1 = new HashSet<>();
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s1.add("d");
        System.out.println(s1);

        HashSet<String> s2 = new HashSet<>();
        s2.addAll(s1);
        s2.add("e");

        System.out.println(s2);

        System.out.println(s1.contains("a"));
        System.out.println(s1.containsAll(s2));
        System.out.println(s2);
        System.out.println(s1.retainAll(s2));
        System.out.println(s1);

        // LinkedHash set

        LinkedHashSet<Integer> l1 = new LinkedHashSet<>();
        l1.add(4);
        l1.add(6);
        l1.add(3);
        l1.add(10);
        System.out.println(l1);

        TreeSet<String> t1 = new TreeSet<>();

        t1.add("apple");
        t1.add("mango");
        t1.add("guva");
        t1.add("pineapple");
        t1.add("banana");
        System.out.println(t1);

    }

}
