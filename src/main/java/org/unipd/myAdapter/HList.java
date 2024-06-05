package org.unipd.myAdapter;

public interface HList{
    void add(int index, Object element);
        //Inserts the specified element at the specified position in this list (optional operation).
    boolean add(Object o);
        //Appends the specified element to the end of this list (optional operation).
    boolean addAll(HCollection c);
        //Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator (optional operation).
    boolean addAll(int index, HCollection c);
        //Inserts all of the elements in the specified collection into this list at the specified position (optional operation).
    void clear();
        //Removes all of the elements from this list (optional operation).
    boolean contains(Object o);
        //Returns true if this list contains the specified element.
    boolean containsAll(HCollection c);
        //Returns true if this list contains all of the elements of the specified collection.
    boolean equals(Object o);
        //Compares the specified object with this list for equality.
    Object get(int index);
        //Returns the element at the specified position in this list.
    int hashCode();
        //Returns the hash code value for this list.
    int indexOf(Object o);
        //Returns the index in this list of the first occurrence of the specified element, or -1 if this list does not contain this element.
    boolean isEmpty();
        //Returns true if this list contains no elements.
    HIterator iterator();
        //Returns an iterator over the elements in this list in proper sequence.
    int lastIndexOf(Object o);
        //Returns the index in this list of the last occurrence of the specified element, or -1 if this list does not contain this element.
    HListIterator listIterator();
        //Returns a list iterator of the elements in this list (in proper sequence).
    HListIterator listIterator(int index);
        //Returns a list iterator of the elements in this list (in proper sequence), starting at the specified position in this list.
    Object remove(int index);
        //Removes the element at the specified position in this list (optional operation).
    boolean remove(Object o);
        //Removes the first occurrence in this list of the specified element (optional operation).
    boolean removeAll(HCollection c);
        //Removes from this list all the elements that are contained in the specified collection (optional operation).
    boolean retainAll(HCollection c);
        //Retains only the elements in this list that are contained in the specified collection (optional operation).
    Object set(int index, Object element);
        //Replaces the element at the specified position in this list with the specified element (optional operation).
    int size();
        //Returns the number of elements in this list.
    HList subList(int fromIndex, int toIndex);
        //Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
    Object[] toArray();
        //Returns an array containing all of the elements in this list in proper sequence.
    Object[] toArray(Object[] a);
        //Returns an array containing all of the elements in this list in proper sequence; the runtime type of the returned array is that of the specified array.
}