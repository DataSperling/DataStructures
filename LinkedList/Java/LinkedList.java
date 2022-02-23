/**
* Generic LinkedList (singly linked list) implementation with external node class
*
* @author DatSperling
* @version 1.1
*/
public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;
    
    /*
    * Adds new node in front of previous head in O(1)
    *
    * @param data: data to add to head of list
    * @throws: java.lang.IllegalArgumentException if data is null
    */
    public void addToFront(T data) {
        if (data == null) {
            throw new IllegalArgumentException("Error: data can't be null");
        }
    }
    
    public void addToBack(T data) {
    }
    
    public T removeFromFront() {
        return head.getData();
    }
    
    public T removeFromBack() {
        return tail.getData();
    }
    
    public String toString() {
        return null;
    }    
       
    
    

    
    
 }
