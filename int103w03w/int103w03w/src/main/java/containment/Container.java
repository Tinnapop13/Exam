package containment;

import java.util.Arrays;

public class Container<T> implements Containable<T> {
    
    private final static int SIZE = 5;
    private T[] box = (T[]) new Object[SIZE];
    private int count;

    @Override
    public boolean add(T t) {
        if (t == null) return false;
        if (count == SIZE) return false;
        box[count++] = t;
        return true;
    }

    @Override
    public T get(T t) {
        if (t == null) return null; 
        for (int i = 0; i < count; i++) {
            if (box[i].equals(t)) return box[i];
        }
        return null;
    }
    
    @Override
    public void sort() { 
        if (count < 2) return;
//        Arrays.sort();
    }
    
}
