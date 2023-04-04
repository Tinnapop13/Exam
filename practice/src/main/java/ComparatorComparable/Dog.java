package ComparatorComparable;

public final class Dog extends Animal implements Comparable<Dog> {
    private String species;

    public Dog(String species,int leg,String name) {
        super(leg,name);
        this.species = species;
    }
    
    public String getSpecies(){
        return this.species;
    }

    @Override
    public String toString() {
        return "Dog : species = " + species + " ,leg = " + this.leg + " ,name = " + this.name;
    }
    
    @Override
    public void animalSay() {
        System.out.println("Animal Say : Bark!!");
    }

    @Override
    public int compareTo(Dog that) {
        return this.leg > that.leg ? 1 : -1 ;
        
    }

    public int getLeg() {
        return leg;
    }
    
}
