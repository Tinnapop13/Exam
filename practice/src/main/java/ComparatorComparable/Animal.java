package ComparatorComparable;


public abstract class Animal {
    private final int LIFE = 1;
    int leg;
    String name;

    public Animal(int leg, String name) {
        this.leg = leg;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLeg() {
        return leg;
    }
   
    
    
 
    public abstract void animalSay();
    

    
    
}
