package org.unipd.myAdapter;


public interface HList extends HCollection{
    void add(int index, Object element);
        //Inserts the specified element at the specified position in this list (optional operation).
    boolean addAll(int index, HCollection c);
        //Inserts all of the elements in the specified collection into this list at the specified position (optional operation).
    Object get(int index);
        //Returns the element at the specified position in this list.
    int indexOf(Object o);
        //Returns the index in this list of the first occurrence of the specified element, or -1 if this list does not contain this element.
    int lastIndexOf(Object o);
        //Returns the index in this list of the last occurrence of the specified element, or -1 if this list does not contain this element.
    HListIterator listIterator();
        //Returns a list iterator of the elements in this list (in proper sequence).
    HListIterator listIterator(int index);
        //Returns a list iterator of the elements in this list (in proper sequence), starting at the specified position in this list.
    Object remove(int index);
        //Removes the element at the specified position in this list (optional operation).
    Object set(int index, Object element);
        //Replaces the element at the specified position in this list with the specified element (optional operation).
    HList subList(int fromIndex, int toIndex);
        //Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
}