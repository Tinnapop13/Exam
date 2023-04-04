package containment;

public interface Containable<T> {
    public boolean add(T t);
    public Object get(T t);
    public void sort();
}
