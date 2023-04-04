package int103w03w;

import containment.*;
import human.*;

public class Int103w03w {

    public static void main(String[] args) {
        testContainable();
    }
    static void testContainable() {
        Containable<Person> c = new Container<>();
        System.out.println("Add P3: " + c.add(new Person(3,"Three")));
        System.out.println("Add S4: " + c.add(new Student(4,"Four","IT")));
        //System.out.println("Add Other: " + c.add("String..."));
        System.out.println("Add null: " + c.add(null));
        System.out.println("Add P7: " + c.add(new Person(7,"Seven")));
        System.out.println("Add S6: " + c.add(new Student(6,"Six","CS")));
        System.out.println("Add P5: " + c.add(new Person(5,"Five")));
        System.out.println("Add S2: " + c.add(new Student(2,"Two","DSI")));
        System.out.println("Get S4: " + c.get(new Student(4,null,null)));
        System.out.println("Get S8: " + c.get(new Student(8,null,null)));
        System.out.println("Get S3: " + c.get(new Student(3,null,null)));
        System.out.println("Get null: " + c.get(null));
        //System.out.println("Get Other: " + c.get("String..."));
        System.out.println("Get P3: " + c.get(new Person(3,null)));
        System.out.println("Get P4: " + c.get(new Person(4,null)));
    }
}
