
package practice;
import ComparatorComparable.AnimalContainer;
import ComparatorComparable.Dog;
import IteratorIterable.Cat;
import IteratorIterable.ToIterate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Practice {

    public static void main(String[] args) {
//       testComparatorComparable();
       testIteratorIterable();
    }
    
    public static void testComparatorComparable(){
        Comparator<Dog> com = new Comparator<>(){
            @Override
            public int compare(Dog a,Dog b){
                return a.getLeg() < b.getLeg() ? 1 : -1;
            }
        };
        
        AnimalContainer<Dog> ac = new AnimalContainer<>() ;
        
        Dog dew = new Dog("corgi",3,"dew");
        Dog vee = new Dog("puck",3,"vee");
        ac.addAnimal(dew);
        ac.addAnimal(vee);
      
        
        for (int i = 0; i < 10; i++) {
            ac.addAnimal(new Dog("unknown",i,"unknown"));
        }
        Arrays.sort(ac.animal_container);
        
        Arrays.sort(ac.animal_container,com);
        
        for (int i = 0; i < 10; i++) {
             System.out.println("Animal Container[ " + i + " ] : " + ac.animal_container[i]);
        }
        System.out.println(dew.compareTo(vee));
        
       
    }
    public static void testIteratorIterable(){
        ToIterate toiterate = new ToIterate();
        int[] a = {1,2,3,4,5};
         for (int i = 0; i < 10; i++) {
            toiterate.cl.add(i, new Cat("unknown",i,"unknown"));
        }
//        Iterator clc = catiter.cl.iterator();
//        while(clc.hasNext()){
//            System.out.println(clc.next());
//        }
       
        for (Object element : toiterate) {
        System.out.println(element);
        }

       //error if we didnt implement Iterable to write for each and use variable of object that create new in list container class
        
    }
    
    public static void testStream(){}
    public static void testCollection(){}
    public static void testList(){}
    public static void testSet(){}
    public static void testMap(){}
    public static void testStackQueue(){}
    
}
