package Day5;

public class Strings {
    public static void main(String[] args) {
        String name="Hello World!";
        System.out.println(name);
        System.out.println(name.length()); // print length of string
        System.out.println(name.charAt(4));  //print a single character at index 4
        String s1="JAVA";
        String s2="java";
        System.out.println(s1.equals(s2));    //check if s1=s2 //boolean: false
        System.out.println(s1.equalsIgnoreCase(s2)); //check s1=s2 ignore case // true
        System.out.println(name.substring(0,5));     // print string divide into parts
        System.out.println(name.trim().length());
    }
}
