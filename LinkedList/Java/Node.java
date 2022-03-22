/**
* Generic Node class for LinkedList (singly linked list)
*
* @author DataSperling
* @version 1.3
*/

public class Node<T> {

    private T data;
    private Node<T> next;
    
    /*
    * Constructs a new node with given data AND next reference
    *
    * @param data: the data to be stored in the node
    * @param next: reference to next node in list
    */
    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
    
    /*
    * Node constructor with only data field for adding to list
    *
    * @param data: the data to be added to the node
    */    
    Node(T data) {
        this(data, null);
    }
    
    /*
    * Getter for data
    *
    * @return: the data to return
    */
    T getData() {
        return data;
    }
    
    /*
    * Getter for next node
    *
    * @return: the next node in the list
    */
    Node<T> getNext() {
        return next;
    }
    
    /*
    * Setter for next reference
    *
    * @param next: the next reference to be set
    */
    void setNext(Node<T> next) {
        this.next = next;    
    }
}
