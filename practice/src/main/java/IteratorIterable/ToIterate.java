/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IteratorIterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author tinnapop
 */
public class ToIterate<T> implements Iterable<T>  {
    
     public List<T> cl; 
     

    public ToIterate() {
           this.cl = new ArrayList<>();
    }
     
     

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<T> {
        
        int i;

        @Override
        public boolean hasNext() {
            
            return i < cl.size();
        }

        @Override
        public T next() {
            return cl.get(i++);
        }
    
}
     
     
  
    
    
}
