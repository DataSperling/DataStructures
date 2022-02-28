public class Main {

    public static void main(String[] args) {
    
        LinkedList<String> webHistory = new LinkedList<>();
        
        webHistory.addToBack("www.google.com");
        
        //System.out.println( webHistory.toString() );
        
        webHistory.addToBack("www.github.com");
        
        //System.out.println( webHistory.toString() );
        
        webHistory.addToBack("www.github.com");
        
        
        System.out.println( webHistory.toString() );
        
        //webHistory.removeFromFront();
        
        System.out.println( webHistory.toString() );
        
        System.out.println( "head: " + webHistory.getHead().getData() );
        System.out.println( "tail: " + webHistory.getTail().getData() );
    }
}
