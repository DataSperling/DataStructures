/**
* Generic Node class for LinkedList (singly linked list)
*
* @author DatSperling
* @version 1.2
*/

public class Main {

    public static void main(String[] args) {
    
        LinkedList<String> webhistory = new LinkedList<>();
        
        webhistory.addToBack("www.google.com");
        
        
        //system.out.println( webhistory.tostring() );
        
        webhistory.addToBack("www.github.com");
       
        
        //system.out.println( webhistory.tostring() );
        
        webhistory.addToBack("www.stackoverflow.com");
        
        
        
        //system.out.println( webhistory.tostring() );
        
        //webhistory.removefromfront();
        
        System.out.println( webhistory.toString() );
        
//        webhistory.removefromback();
//        
//        system.out.println( webhistory.tostring() );
//        
//        system.out.println( "head: " + webhistory.gethead().getdata() );
//        system.out.println( "tail: " + webhistory.gettail().getdata() );

        webhistory.addBefore( "www.gggstackoverflow.com", "www.superuser.com");
        
        System.out.println( webhistory.toString() );



    }
}
