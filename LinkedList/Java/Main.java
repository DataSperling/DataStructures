/**
* Main driver class to demonstrate the use of a LinkedList with Strings representing
* a web history stack
* 
* @author DataSperling
* @version 1.4
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
        
        /*
        * Requires at least one node as calls head.getData()
        * will throw unhandled exception in empty list
        */
        System.out.println("\n");
        System.out.println("Current LinkedList Structure is: ...");
        System.out.println( webHistory.toString() );
        System.out.println( "head: " + webHistory.getHead().getData() );
        System.out.println( "tail: " + webHistory.getTail().getData() );
        System.out.println("\n");        
        
        webHistory.addBefore("www.zollsoft.de", "www.datascience.com");
        
        /*
        * Requires at least one node as calls head.getData()
        * will throw unhandled exception in empty list
        */
        System.out.println("\n");
        System.out.println("Current LinkedList Structure is: ...");
        System.out.println( webHistory.toString() );
        System.out.println( "head: " + webHistory.getHead().getData() );
        System.out.println( "tail: " + webHistory.getTail().getData() );
        System.out.println("\n");

        webHistory.addAfter( "www.stackoverflow.com", "www.superuser.com");
        
        /*
        * Requires at least one node as calls head.getData()
        * will throw unhandled exception in empty list
        */
        System.out.println("\n");
        System.out.println("Current LinkedList Structure is: ...");
        System.out.println( webHistory.toString() );
        System.out.println( "head: " + webHistory.getHead().getData() );
        System.out.println( "tail: " + webHistory.getTail().getData() );
        System.out.println("\n");
        
        System.out.println("removedToken: " + webHistory.removeData("www.stackoverflow.com"));

        webHistory.addAfter("www.knime.de", "www.ineos.no");
        
        /*
        * Requires at least one node as calls head.getData()
        * will throw unhandled exception in empty list
        */
        System.out.println("\n");
        System.out.println("Current LinkedList Structure is: ...");
        System.out.println( webHistory.toString() );
        System.out.println( "head: " + webHistory.getHead().getData() );
        System.out.println( "tail: " + webHistory.getTail().getData() );
        System.out.println("\n");



    }
}



