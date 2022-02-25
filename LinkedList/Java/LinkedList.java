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
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(head);
        head = newNode;                
    }
    
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
    
    public void addToBack(T data) {
    }
    
    public T removeFromFront() {
        return head.getData();
    }
    
    public T removeFromBack() {
        return tail.getData();
    }
    
    public String toString() {
        String output = "";
        Node<T> current = head;
        
        while (current.getNext() != null) {
            output += current.getData();
            if (current.getNext() != null) {
                output += ", ";
            }
            current = current.getNext();
        }
        return "Linked List: " + output;
    }
    
        
       
    
    

    
    
 }
