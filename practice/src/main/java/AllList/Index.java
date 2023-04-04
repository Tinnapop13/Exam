/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author tinnapop
 */
public class Index {
    public static void main(String[] args) {
        Set<String> hashset = new HashSet<String>();
      hashset.add("apple");
      hashset.add("banana");
      hashset.add("cherry");

      System.out.println("My set contains: " + hashset);

      Map<String, Integer> myMap = new HashMap<String, Integer>();
      myMap.put("apple", 1);
      myMap.put("banana", 2);
      myMap.put("cherry", 3);

      System.out.println("My map contains: " + myMap);
      
      TreeSet<String> treeset = new TreeSet<String>();
      treeset.add("apple");
      treeset.add("banana");
      treeset.add("cherry");

      System.out.println("My set contains: " + treeset);

      TreeMap<String, Integer> treemap = new TreeMap<String, Integer>();
      treemap.put("apple", 1);
      treemap.put("banana", 2);
      treemap.put("cherry", 3);

      System.out.println("My map contains: " + myMap);
      
      HashSet<String> mySet = new HashSet<String>();
      mySet.add("apple");
      mySet.add("banana");
      mySet.add("cherry");

      System.out.println("My set contains: " + mySet);

      HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
      hashmap.put("apple", 1);
      hashmap.put("banana", 2);
      hashmap.put("cherry", 3);

      System.out.println("My map contains: " + hashmap);

      // Lookup the value associated with a key in the map
      int cherryValue = hashmap.get("cherry");
      System.out.println("The value associated with 'cherry' is: " + cherryValue);
      
      Stack<String> myStack = new Stack<String>();
      myStack.push("apple");
      myStack.push("banana");
      myStack.push("cherry");

      System.out.println("My stack contains: " + myStack);

      String topElement = myStack.peek();
      System.out.println("The element at the top of the stack is: " + topElement);

      String poppedElement = myStack.pop();
      System.out.println("The element popped from the top of the stack is: " + poppedElement);
      System.out.println("My stack now contains: " + myStack);
      
      Queue<String> myQueue = new LinkedList<String>();
      myQueue.offer("apple");
      myQueue.offer("banana");
      myQueue.offer("cherry");

      System.out.println("My queue contains: " + myQueue);

      String frontElement = myQueue.peek();
      System.out.println("The element at the front of the queue is: " + frontElement);

      String removedElement = myQueue.poll();
      System.out.println("The element removed from the front of the queue is: " + removedElement);
      System.out.println("My queue now contains: " + myQueue);
    }
}
