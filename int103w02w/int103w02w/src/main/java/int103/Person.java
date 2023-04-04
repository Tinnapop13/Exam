package int103;

public class Person {

    public int pub;
    protected int pro;
    int defa;
    private int id;
    
    public int med() {
        defa = 0;
        id = 0;
        return defa + id;
    }
    
    public void accessTest(Person p) {
        this.id = p.id;
    }
}
