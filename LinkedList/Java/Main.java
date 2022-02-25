public class Main {

    public static void main(String[] args) {
    
        LinkedList<String> webHistory = new LinkedList<>();
        
        webHistory.addToFront("www.google.com");
        webHistory.addToFront("www.github.com");
        
        
        System.out.println( webHistory.toString() );
        }
}
