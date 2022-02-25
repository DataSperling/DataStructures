public class Main {

    public static void main(String[] args) {
    
        LinkedList<String> webHistory = new LinkedList<>();
        
        webHistory.setHead(new Node<>("www.google.com") );
        
        // Instantiate 5 nodes
        Node<String> node2 = new Node<>("www.github.com");
        Node<String> node3 = new Node<>("www.stackoverflow.com");
        Node<String> node4 = new Node<>("www.reddit.com");
        Node<String> node5 = new Node<>("www.stackexhange.com");
        Node<String> node6 = new Node<>("www.bitbucket.org");
        
        
        // assign next references
        webHistory.getHead().setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        
  
    
    }
}
