package ComparatorComparable;
import IteratorIterable.Cat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class AnimalContainer<T>{
    public final static int CONTAINER_LENGTH = 10;
     
    public Dog[] animal_container;
   

    public AnimalContainer() {
        this.animal_container = new Dog[CONTAINER_LENGTH];
    }
    
    
    //need to make this to private
    
    public void addAnimal(Dog dog){
        for (int i = 0; i < CONTAINER_LENGTH; i++) {
            if(animal_container[i] == null){
                animal_container[i] = dog;
                break;
            }
        }
    }

   

  
    public Dog[] getAnimal_container() {
        return  animal_container;
    }
    
    public void expand(){
        animal_container = Arrays.copyOf(animal_container,11);
    }

}







    
    
