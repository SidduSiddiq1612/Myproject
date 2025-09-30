package Day14HW;
import java.util.*;
public class hashmaps {
    public static void main(String[] args) {
        Map<Integer,String> h1=new HashMap<>();
        //Insert a Key value mapping into the map
        h1.put(1,"mahesh");
        h1.put(2,"pawan");
        h1.put(3,"ram");
        h1.put(5,"vijay");
        h1.put(4,"shiva");
        h1.put(5,"abhi");
        h1.put(6,"siddu");
        h1.put(8,"deepak");
        h1.put(7,"raju");
        System.out.println(h1);
        //Fetch the value of a Key
        System.out.println(h1.get(3));
        //Check if the given Key is in the Map
        System.out.println(h1.containsKey(9));
        //Check if the value is in the Map
        System.out.println(h1.containsValue("siddu"));
        //Check if the map is empty
        System.out.println(h1.isEmpty());
        //Print the size of the Map to the console
        System.out.println(h1.size());
        //Print all the Keys of the map to the console
        System.out.println(h1.keySet());
        //Remove a specific Key-value pair
        System.out.println(h1.remove(2));
        System.out.println(h1);
        //Create a clone/copy of HashMap
        //Copy all the elements of the Map to another Map
        Map<Integer,String> h2=new HashMap<>();
        h2.put(9,"lion");
        h2.put(10,"tiger");
        h2.put(11,"cat");
        h2.putAll(h1);
        System.out.println(h2);

    }
}
