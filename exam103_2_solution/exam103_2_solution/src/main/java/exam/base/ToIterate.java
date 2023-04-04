package exam.base;

import java.util.Iterator;

public class ToIterate<T> implements Iterable<T>{ // implements Iterable so that ToIterate can be iterated
    private final T[] internal;

    public static final <T> ToIterate<T> of(T ... ts) {
        T[] array = (T[]) new Object[ts.length];
        System.arraycopy(ts, 0, array, 0, ts.length);
        return new ToIterate(array);
    }

    private ToIterate(T[] ts) { internal = ts; }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }
    
    public class MyIterator implements Iterator<T> {
        private int i;
        @Override
        public boolean hasNext() {
            return i < internal.length;
        }

        @Override
        public T next() {
           return internal[i++];
            
            }
    }

}
