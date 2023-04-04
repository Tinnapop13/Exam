package IteratorIterable;


import ComparatorComparable.Animal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public final class Cat extends Animal  {
    private String species;
    
     
    

    public Cat(String species,int leg,String name) {
        super(leg,name);
        this.species = species;
    }
    
    public String getSpecies(){
        return this.species;
    }

    @Override
    public String toString() {
        return "Cat : species = " + species + " ,leg = " + super.getLeg() + " ,name = " + super.getName();
    }
    
    @Override
    public void animalSay() {
        System.out.println("Animal Say : Meow!!");
    }

    
    }
 
    

