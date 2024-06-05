package org.unipd.myAdapter;


public interface HListIterator extends HIterator{
    void add(Object o);
        //Inserts the specified element into the list (optional operation).
    boolean hasPrevious();
        //Returns true if this list iterator has more elements when traversing the list in the reverse direction.
    int nextIndex();
        //Returns the index of the element that would be returned by a subsequent call to next.
    Object previous();
        //Returns the previous element in the list.
    int previousIndex();
        //Returns the index of the element that would be returned by a subsequent call to previous.
    void set(Object o);
        //Replaces the last element returned by next or previous with the specified element (optional operation).
}