package Day14;
import java.util.*;
public class maps {
    public static void main(String[] args) {
        //hashmap
        Map<Integer,String> hashmap=new HashMap<>();
        hashmap.put(3,"three");
        hashmap.put(1,"one");
        hashmap.put(2,"two");
        hashmap.put(null,"Nullkey"); //allowed
        hashmap.put(4,"null");
        System.out.println(hashmap);
        //to remove specific key value pair
        hashmap.remove(3);
        System.out.println(hashmap);
        System.out.println(hashmap.get(4));
        //to get all keys in hashmap
        System.out.println(hashmap.keySet());
        //to get all values in hashmap
        System.out.println(hashmap.entrySet());

        //LinkedHashMap
        Map<Integer,String> l1=new LinkedHashMap<>();
        l1.put(4,"hello");
        l1.put(3,"hi");
        l1.put(2,"hey");
        System.out.println(l1);

        //TreeMap
        Map<Integer,String> treemap=new TreeMap<>();
        treemap.put(3,"three");
        treemap.put(1,"one");
        treemap.put(2,"two");
        treemap.put(4,null); //allowed
        System.out.println(treemap);

        //Hashtable
        Map<Integer,String> hashtable=new Hashtable<>();
        hashtable.put(3,"Three");
        hashtable.put(1,"one");
        hashtable.put(2,"two");
        //hashtable.put(null,"Nullkey");  //null pointer exception
        //hashtable.put(4,null);  //null pointer exception
        System.out.println(hashtable);
    }
}
