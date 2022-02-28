import java.util.NoSuchElementException;

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
    * Getter for size of LinkedList
    *
    * @return: number of nodes in LinkedList as int
    */
    public int getSize() {
        return this.size;
    }
    
    
    /*
    * Adds node to front in O(1) time
    *
    * @param: data: data to add to head of list
    * @throws: java.lang.IllegalArgumentException if data is null
    */
    public void addToFront(T data) {
        if (data == null) {
            throw new IllegalArgumentException("Error: data can't be null");
        }
        Node<T> newNode = new Node<T>(data);
        
        if (size == 0) {            
            head = newNode;
            tail = head;
        } else {
            newNode.setNext(head);
            head = newNode;
            tail = newNode;
        }
        size ++;                            
    }
    
    
    /*
    * Adds node to back in O(n) time
    *
    * @param data: the data added to back of LinkedList
    * @throws: java.lang.IllegalArgumentException if data is null
    */    
    public void addToBack(T data) {
        if (data == null) {
            throw new IllegalArgumentException("Error: data can't be null");
        }
        Node<T> newNode = new Node<>(data);
        
        if (size == 0) {
            head = newNode;
            tail = head;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();            
            }
            current.setNext(new Node<T>(data));
        }        
        size ++;
    }
    
    /*
    * Removes first node in O(1) time
    *
    * @return: the data from the node removed
    * @throws: java.util.NoSuchElementException
    */
    public T removeFromFront() {
        if (size == 0) {
            throw new java.util.NoSuchElementException("Error: list is empty");
        }
        T data = head.getData();
        
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.getNext();
        }
        size --;
        return data;
    }
    
    /*
    * Removes from front in O(1) time
    *
    *
    *
    */
    public T removeFromBack() {
        return tail.getData();
    }
    
    public String toString() {
        String output = "";
        Node<T> current = head;        
        while (current != null) {
            output += current.getData();
            if (current.getNext() != null) {
                output += ", ";
            }
            current = current.getNext();
        }
        return "Linked List comprises " + size + " node(s): " + output;
    }
    
    public Node<T> getHead() {
        return head;
    }
    
    public Node<T> getTail() {
        return tail;
    }
    
        
       
    
    

    
    
 }
