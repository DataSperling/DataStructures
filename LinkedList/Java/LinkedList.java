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
    * Getter for head of LinkedList
    *
    * @return: pointer to head of the LinkedList
    */
    public Node<T> getHead() {
        return head;
    }
    
    
    /*
    * Setter for head of LinkedList
    *
    * @param head: the new LinkedList head
    */
    public void setHead(Node<T> head) {
        this.head = head;
    }
    
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
    * @param data: data to add to head of list
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
        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();            
        }
        current.setNext(new Node<T>(data));
        size += 1;
    }
    
    public T removeFromFront() {
        return head.getData();
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
        return "Linked List has " + size + " node(s): " + output;
    }
    
        
       
    
    

    
    
 }
