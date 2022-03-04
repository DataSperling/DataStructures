/*
* Generic interface for LinkedList node
*
* @property data: the data stored in the node
* @property next: pointer referencing the next node in the LinkedList
*/

export interface Node<T> {
    data: T;
    next?: Node<T>;
}
