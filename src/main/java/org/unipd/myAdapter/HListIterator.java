package org.unipd.myAdapter;

public interface HListIterator{
    void add(Object o);
        //Inserts the specified element into the list (optional operation).
    boolean hasNext();
        //Returns true if this list iterator has more elements when traversing the list in the forward direction.
    boolean hasPrevious();
        //Returns true if this list iterator has more elements when traversing the list in the reverse direction.
    Object next();
        //Returns the next element in the list.
    int nextIndex();
        //Returns the index of the element that would be returned by a subsequent call to next.
    Object previous();
        //Returns the previous element in the list.
    int previousIndex();
        //Returns the index of the element that would be returned by a subsequent call to previous.
    void remove();
        //Removes from the list the last element that was returned by next or previous (optional operation).
    void set(Object o);
        //Replaces the last element returned by next or previous with the specified element (optional operation).
}