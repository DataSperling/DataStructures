class Node[T](var data: T, var Next: Node[T]) {

    def getData: T = this.data
    
    def getNext: Node[T] = this.next;
    
    def toString(): Unit = {
        print(data)        
        if (next != null) {
            print(", ")
            next.toString();
        }
    }
}
