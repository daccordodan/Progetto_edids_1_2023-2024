package org.unipd.myAdapter;

public interface HIterator{
    boolean hasNext();
        //Returns true if the iteration has more elements.
    Object next();
        //Returns the next element in the iteration.
    void remove();
        //Removes from the underlying collection the last element returned by the iterator (optional operation).
}