package int103w05w;

import collection.Group;
import human.Gender;
import human.Person;
import school.Level;
import school.Student;

public class Int103w05w {

    public static void main(String[] args) {
        //testPerson();
        testGroup();
        //testEnum();
        //testIterator();
    }
    static void testEnum() {
        var genders = Gender.values();
        for (var value : genders) {
            System.out.println("Gender: " + value);
        }
        for (var value : Level.values()) {
            System.out.println("Level: " + value + ", Year: " + value.getYear());
        }
        Level lvl = Level.valueOf("FRESHMAN");
        System.out.println("Level.FRESHMAN: Year: " + lvl.getYear()
                + ", desc: " + lvl.getDesc()
                + ", ordinal:" + lvl.ordinal());
        switch (lvl) {
            case FRESHMAN -> System.out.println("Year ONE");
            case SOPHOMORE -> System.out.println("Year TWO");
            case JUNIOR -> System.out.println("Year THRE");
            case SENIOR -> System.out.println("Year FOUR");
        }
    }
    static void testPerson() {
        var p0 = new Person(Gender.MALE,"Sampson","Jones");
        var p1 = new Person(Gender.FEMALE,"Alberta","Dole");
        var p2 = new Person(Gender.MALE,"Robert","Smith");
        System.out.println("p0: " + p0);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
    }
    static void testGroup() {
        var p0 = new Person(Gender.MALE,"Sampson","Jones");
        var s1 = new Student(Gender.FEMALE,"Smorn","Supap",Level.SOPHOMORE);
        var p2 = new Person(Gender.FEMALE,"Alberta","Dole");
        var s3 = new Student(Gender.MALE, "Prateep","Orose",Level.FRESHMAN);
        var p4 = new Person(Gender.MALE,"Robert","Smith");
        var g = new Group<Person>();
        System.out.println("add p2: " + g.add(p2));
        System.out.println("add s3: " + g.add(s3));
        System.out.println("add p0: " + g.add(p0));
        System.out.println("add p4: " + g.add(p4));
        System.out.println("add s1: " + g.add(s1));
        System.out.println("Listing g: " + g);
        System.out.println("sorting g: " + g.sort());
        System.out.println("sorting g by firstname: " + g.sort(Person.FIRSTNAME_COMPARATOR));
        System.out.println("sorting g by lastname: " + g.sort(Person.LASTNAME_COMPARATOR));
        System.out.println("sorting g by gender: " 
                + g.sort((px, py) -> px.getGender().compareTo(py.getGender())));
    }
    static void testIterator() {
        var p0 = new Person(Gender.MALE,"Sampson","Jones");
        var s1 = new Student(Gender.FEMALE,"Smorn","Supap",Level.SOPHOMORE);
        var p2 = new Person(Gender.FEMALE,"Alberta","Dole");
        var s3 = new Student(Gender.MALE, "Prateep","Orose",Level.FRESHMAN);
        var p4 = new Person(Gender.MALE,"Robert","Smith");
        var g = new Group<Person>();
        System.out.println("add p2: " + g.add(p2));
        System.out.println("add s3: " + g.add(s3));
        System.out.println("add p0: " + g.add(p0));
        System.out.println("add p4: " + g.add(p4));
        System.out.println("add s1: " + g.add(s1));
        System.out.println("Listing g: " + g);
        var it = g.iterator();
        System.out.println("it: Has Next? " + it.hasNext() + ", Next: " + it.next());
        System.out.println("it: Has Next? " + it.hasNext() + ", Next: " + it.next());
        var i2 = g.iterator();
        while (i2.hasNext()) {
            System.out.println("i2 Next: " + i2.next());
        }
        System.out.println("Sorting g: " + g.sort());
        //System.out.println("it: Has Next? " + it.hasNext() + ", Next: " + it.next());
    }
}
