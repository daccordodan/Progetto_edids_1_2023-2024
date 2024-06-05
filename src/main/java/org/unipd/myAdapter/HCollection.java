package org.unipd.myAdapter;

/**
 *
 * @author dacco
 */

public interface HCollection{
    boolean add(Object o);
        //Ensures that this collection contains the specified element (optional operation).
    boolean addAll(HCollection c);
        //Adds all of the elements in the specified collection to this collection (optional operation).
    void clear();
        //Removes all of the elements from this collection (optional operation).
    boolean contains(Object o);
        //Returns true if this collection contains the specified element.
    boolean containsAll(HCollection c);
        //Returns true if this collection contains all of the elements in the specified collection.
    @Override
    boolean equals(Object o);
        //Compares the specified object with this collection for equality.
    @Override
    int hashCode();
        //Returns the hash code value for this collection.
    boolean isEmpty();
        //Returns true if this collection contains no elements.
    HIterator iterator();
        //Returns an iterator over the elements in this collection.
    boolean remove(Object o);
        //Removes a single instance of the specified element from this collection, if it is present (optional operation).
    boolean removeAll(HCollection c);
        //Removes all this collection's elements that are also contained in the specified collection (optional operation).
    boolean retainAll(HCollection c);
        //Retains only the elements in this collection that are contained in the specified collection (optional operation).
    int size();
        //Returns the number of elements in this collection.
    Object[] toArray();
        //Returns an array containing all of the elements in this collection.
    Object[] toArray(Object[] a);
        //Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array.
}

