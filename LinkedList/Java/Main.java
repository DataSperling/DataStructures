/**
* Main driver class to demonstrate the use of a LinkedList with Strings representing
* a web history stack
* 
* @author DataSperling
* @version 1.3
*/

public class Main {

    public static void main(String[] args) {
    
        LinkedList<String> webHistory = new LinkedList<>();
        
        webHistory.addToBack("www.github.com");
       
        webHistory.addToBack("www.stackoverflow.com");
        
        webHistory.addToBack("www.zollsoft.de");
        
        webHistory.addToBack("www.askubuntu.com");
       
        webHistory.addToBack("www.basf.com");
        
        webHistory.addToBack("www.knime.de");
        
        System.out.println("\n");
        System.out.println("Current LinkedList Structure is: ...");
        System.out.println( webHistory.toString() );
        System.out.println( "head: " + webHistory.getHead().getData() );
        System.out.println( "tail: " + webHistory.getTail().getData() );
        System.out.println("\n");        
//        
//        webHistory.addBefore("www.zollsoft.de", "www.askubuntu.com");
//        
//        System.out.println("\n");
//        System.out.println("Current LinkedList Structure is: ...");
//        System.out.println( webHistory.toString() );
//        System.out.println( "head: " + webHistory.getHead().getData() );
//        System.out.println( "tail: " + webHistory.getTail().getData() );
//        System.out.println("\n");

//        webHistory.addBefore( "www.stackoverflow.com", "www.superuser.com");
//        
//        System.out.println("\n");
//        System.out.println("Current LinkedList Structure is: ...");
//        System.out.println( webHistory.toString() );
//        System.out.println( "head: " + webHistory.getHead().getData() );
//        System.out.println( "tail: " + webHistory.getTail().getData() );
//        System.out.println("\n");
//        
        System.out.println( webHistory.removeData("www.github.com") );
        
        System.out.println("\n");
        System.out.println("Current LinkedList Structure is: ...");
        System.out.println( webHistory.toString() );
        System.out.println( "head: " + webHistory.getHead().getData() );
        System.out.println( "tail: " + webHistory.getTail().getData() );
        System.out.println("\n");



    }
}



