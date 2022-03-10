

public class Node<T> {
    private Node<T> next;
    private T data;
    
    public Node(T data) : this(data, null) {
    }
    
    
    Public Node<T> Next {
        get {
            return next;
        } set {
            next = data;
        }
    }
    
    Public T data {
        get {
            return data;
        } set {
            data = value;
        }
    }
    
    public override string ToString() {
        if (data == null) {
            return string.Empty;
        }
        return item.ToString();
    }
    
}
