package org.unipd.myAdapter;
/**
 * ListAdapter, as the name says, is the adapter between {@link Vector} class anche List interface (or better {@link HList}).
 * <p>That class is part of the Adapter design pattern.
 * 
 * @version 1.0
 * @author dacco
 */


import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Vector;


public class ListAdapter extends Object implements HList{

    private Vector list;

    /**
     * Basic constructor, there's no parameters
     */
    public ListAdapter(){
        list=new Vector();
    }

    /**
     * Copy constructor, receives an HList to be copied in the new one
     * @param List - HList, will be copied in the new one
     */
    public ListAdapter(HList List){
        list=new Vector();
        addAll(List);
    }   

    /**
     * Inserts the specified element at the specified position in this list (optional operation). Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
     * @param index - index at which the specified element is to be inserted.
     * @param element - element to be inserted.
     * @throws UnsupportedOperationException - if the add method is not supported by this list.
     * @throws ClassCastException - if the class of the specified element prevents it from being added to this list.
     * @throws NullPointerException - if the specified element is null and this list does not support null elements.
     * @throws IllegalArgumentException - if some aspect of the specified element prevents it from being added to this list.
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index > size()).
     */
    @Override
    public void add(int index, Object element) throws UnsupportedOperationException,ClassCastException,NullPointerException,IllegalArgumentException,IndexOutOfBoundsException{
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Ensures that this collection contains the specified element (optional operation). Returns {@code true} if this collection changed as a result of the call. (Returns {@code false} if this collection does not permit duplicates and already contains the specified element.)
     * Collections that support this operation may place limitations on what elements may be added to this collection. In particular, some collections will refuse to add {@code null} elements, and others will impose restrictions on the type of elements that may be added. Collection classes should clearly specify in their documentation any restrictions on what elements may be added.
     * If a collection refuses to add a particular element for any reason other than that it already contains the element, it must throw an exception (rather than returning {@code false}). This preserves the invariant that a collection always contains the specified element after this call returns.
     * @param o - element whose presence in this collection is to be ensured.
     * @return {@code true} if this collection changed as a result of the call
     * @throws UnsupportedOperationException - add is not supported by this collection.
     * @throws ClassCastException - class of the specified element prevents it from being added to this collection.
     * @throws NullPointerException - if the specified element is null and this collection does not support null elements.
     * @throws IllegalArgumentException - some aspect of this element prevents it from being added to this collection.
     * @see #add(Object)
     */
    @Override
    public boolean add(Object o) throws UnsupportedOperationException,ClassCastException,NullPointerException,IllegalArgumentException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Adds all of the elements in the specified collection to this collection (optional operation). The behavior of this operation is undefined if the specified collection is modified while the operation is in progress. (This implies that the behavior of this call is undefined if the specified collection is this collection, and this collection is nonempty.)
     * @param c - elements to be inserted into this collection.
     * @return {@code true} if this collection changed as a result of the call
     * @throws UnsupportedOperationException - if this collection does not support the addAll method.
     * @throws ClassCastException - if the class of an element of the specified collection prevents it from being added to this collection.
     * @throws NullPointerException - if the specified collection contains one or more null elements and this collection does not support null elements, or if the specified collection is null.
     * @throws IllegalArgumentException - some aspect of an element of the specified collection prevents it from being added to this collection.
     */
    @Override
    public boolean addAll(HCollection c)throws UnsupportedOperationException,ClassCastException,NullPointerException,IllegalArgumentException{
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Inserts all of the elements in the specified collection into this list at the specified position (optional operation). Shifts the element currently at that position (if any) and any subsequent elements to the right (increases their indices). The new elements will appear in this list in the order that they are returned by the specified collection's iterator. The behavior of this operation is unspecified if the specified collection is modified while the operation is in progress. (Note that this will occur if the specified collection is this list, and it's nonempty.)
     * @param index - index at which to insert first element from the specified collection.
     * @param c - elements to be inserted into this list.
     * @return {@code true} if this list changed as a result of the call.
     * @throws UnsupportedOperationException - if the addAll method is not supported by this list.
     * @throws ClassCastException - if the class of one of elements of the specified collection prevents it from being added to this list.
     * @throws NullPointerException - if the specified collection contains one or more null elements and this list does not support null elements, or if the specified collection is null.
     * @throws IllegalArgumentException - if some aspect of one of elements of the specified collection prevents it from being added to this list.
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index > size()).
     */
    @Override
    public boolean addAll(int index, HCollection c) throws UnsupportedOperationException,ClassCastException,NullPointerException,IllegalArgumentException,IndexOutOfBoundsException{
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Removes all of the elements from this collection (optional operation). This collection will be empty after this method returns unless it throws an exception.
     * @throws UnsupportedOperationException - if the clear method is not supported by this collection.
     */
    @Override
    public void clear() throws UnsupportedOperationException{
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns {@code true} if this collection contains the specified element. More formally, returns {@code true} if and only if this collection contains at least one element {@code e} such that {@code (o==null ? e==null : o.equals(e))}.
     * @param o - element whose presence in this collection is to be tested.
     * @return {@code true} if this collection contains the specified element
     * @throws ClassCastException - if the type of the specified element is incompatible with this collection (optional).
     * @throws NullPointerException - if the specified element is null and this collection does not support null elements (optional).
     * @see    #contains(Object)
     */
    @Override
    public boolean contains(Object o) throws ClassCastException, NullPointerException{
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns {@code true} if this collection contains all of the elements in the specified collection.
     * @param c - collection to be checked for containment in this collection.
     * @return {@code true} if this collection contains all of the elements in the specified collection
     * @throws ClassCastException - if the types of one or more elements in the specified collection are incompatible with this collection (optional).
     * @throws NullPointerException - if the specified collection contains one or more null elements and this collection does not support null elements (optional).
     * @throws NullPointerException - if the specified collection is null.
     */
    @Override
    public boolean containsAll(HCollection c)throws ClassCastException,NullPointerException{
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Compares the specified object with this collection for equality.
     * While the {@code HCollection} interface adds no stipulations to the general contract for the {@code Object.equals}, programmers who implement the {@code HCollection} interface "directly" (in other words, create a class that is a {@code HCollection} but is not a {@code Set} or a {@code List}) must exercise care if they choose to override the {@code Object.equals}. It is not necessary to do so, and the simplest course of action is to rely on {@code Object}'s implementation, but the implementer may wish to implement a "value comparison" in place of the default "reference comparison." (The {@code List} and {@code Set} interfaces mandate such value comparisons.)
     * The general contract for the {@code Object.equals} method states that equals must be symmetric (in other words, {@code a.equals(b)} if and only if {@code b.equals(a)}). The contracts for {@code List.equals} and {@code Set.equals} state that lists are only equal to other lists, and sets to other sets. Thus, a custom {@code equals} method for a collection class that implements neither the {@code List} nor {@code Set} interface must return {@code false} when this collection is compared to any list or set. (By the same logic, it is not possible to write a class that correctly implements both the {@code Set} and {@code List} interfaces.)
     * @param o - Object to be compared for equality with this collection.
     * @return {@code true} if the specified object is equal to this collection
     * @see Object#equals(Object)
     * @see Set#equals(Object)
     * @see List#equals(Object)
     */
    @Override
    public boolean equals(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns the element at the specified position in this list.
     * @param index - index of element to return.
     * @return the element at the specified position in this list.
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size()).
     */
    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns the hash code value for this collection. While the {@code Collection} interface adds no stipulations to the general contract for the {@code Object.hashCode} method, programmers should take note that any class that overrides the {@code Object.equals} method must also override the {@code Object.hashCode} method in order to satisfy the general contract for the {@code Object.hashCode} method. In particular, {@code c1.equals(c2)} implies that {@code c1.hashCode()==c2.hashCode()}.
     * @return the hash code value for this collection
     * @see Object#hashCode()
     * @see Object#equals(Object)
     */
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns the index in this list of the first occurrence of the specified element, or -1 if this list does not contain this element. More formally, returns the lowest index {@code i} such that ({@code o==null ? get(i)==null : o.equals(get(i))}), or -1 if there is no such index.
     * @param o - element to search for.
     * @return the index in this list of the first occurrence of the specified element, or -1 if this list does not contain this element.
     * @throws ClassCastException - if the type of the specified element is incompatible with this list (optional).
     * @throws NullPointerException - if the specified element is null and this list does not support null elements (optional).
     */
    @Override
    public int indexOf(Object o) throws ClassCastException,NullPointerException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns {@code true} if this collection contains no elements.
     * @return {@code true} if this collection contains no elements
     */
    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns an iterator over the elements in this collection. There are no guarantees concerning the order in which the elements are returned (unless this collection is an instance of some class that provides a guarantee).
     * @return a {@code HIterator} over the elements in this collection
     */
    @Override
    public HIterator iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns the index in this list of the last occurrence of the specified element, or -1 if this list does not contain this element. More formally, returns the highest index {@code i} such that ({@code o==null ? get(i)==null : o.equals(get(i))}), or -1 if there is no such index.
     * @param o - element to search for.
     * @return the index in this list of the last occurrence of the specified element, or -1 if this list does not contain this element.
     * @throws ClassCastException - if the type of the specified element is incompatible with this list (optional).
     * @throws NullPointerException - if the specified element is null and this list does not support null elements (optional).
     */
    @Override
    public int lastIndexOf(Object o)throws ClassCastException,NullPointerException{
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns a list iterator of the elements in this list (in proper sequence).
     * @return a list iterator of the elements in this list (in proper sequence).
     */
    @Override
    public HListIterator listIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns a list iterator of the elements in this list (in proper sequence), starting at the specified position in this list. The specified index indicates the first element that would be returned by an initial call to the {@code next} method. An initial call to the {@code previous} method would return the element with the specified index minus one.
     * @param index - index of first element to be returned from the list iterator (by a call to the next method).
     * @return a list iterator of the elements in this list (in proper sequence), starting at the specified position in this list.
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index > size()).
     */
    @Override
    public HListIterator listIterator(int index)throws IndexOutOfBoundsException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Removes the element at the specified position in this list (optional operation). Shifts any subsequent elements to the left (subtracts one from their indices). Returns the element that was removed from the list.
     * @param index - the index of the element to removed.
     * @return the element previously at the specified position.
     * @throws UnsupportedOperationException - if the remove method is not supported by this list.
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size()).
     */
    @Override
    public Object remove(int index) throws UnsupportedOperationException,IndexOutOfBoundsException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Removes a single instance of the specified element from this collection, if it is present (optional operation). More formally, removes an element e such that ({@code o==null ? e==null : o.equals(e)}), if this collection contains one or more such elements. Returns {@code true} if this collection contained the specified element (or equivalently, if this collection changed as a result of the call).
     * @param o - element to be removed from this collection, if present.
     * @return {@code true} if this collection changed as a result of the call
     * @throws ClassCastException - if the type of the specified element is incompatible with this collection (optional).
     * @throws NullPointerException - if the specified element is null and this collection does not support null elements (optional).
     * @throws UnsupportedOperationException - remove is not supported by this collection.
     */
    @Override
    public boolean remove(Object o)  throws ClassCastException,NullPointerException,UnsupportedOperationException{
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Removes all this collection's elements that are also contained in the specified collection (optional operation). After this call returns, this collection will contain no elements in common with the specified collection.
     * @param c - elements to be removed from this collection.
     * @return {@code true} if this collection changed as a result of the call
     * @throws UnsupportedOperationException - if the removeAll method is not supported by this collection.
     * @throws ClassCastException - if the types of one or more elements in this collection are incompatible with the specified collection (optional).
     * @throws NullPointerException - if this collection contains one or more null elements and the specified collection does not support null elements (optional).
     * @throws NullPointerException - if the specified collection is null.
     * @see #remove(Object)
     * @see #contains(Object)
     */
    @Override
    public boolean removeAll(HCollection c) throws UnsupportedOperationException,ClassCastException,NullPointerException{
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Retains only the elements in this collection that are contained in the specified collection (optional operation). In other words, removes from this collection all of its elements that are not contained in the specified collection.
     * @param c - elements to be retained in this collection.
     * @return {@code true} if this collection changed as a result of the call
     * @throws UnsupportedOperationException - if the retainAll method is not supported by this Collection.
     * @throws ClassCastException - if the types of one or more elements in this collection are incompatible with the specified collection (optional).
     * @throws NullPointerException - if this collection contains one or more null elements and the specified collection does not support null elements (optional).
     * @throws NullPointerException - if the specified collection is null.
     * @see #remove(Object)
     * @see #contains(Object)
     */
    @Override
    public boolean retainAll(HCollection c) throws UnsupportedOperationException,ClassCastException,NullPointerException{
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Replaces the element at the specified position in this list with the specified element (optional operation).
     * @param index - index of element to replace.
     * @param element - element to be stored at the specified position.
     * @return the element previously at the specified position.
     * @throws UnsupportedOperationException - if the set method is not supported by this list.
     * @throws ClassCastException - if the class of the specified element prevents it from being added to this list.
     * @throws NullPointerException - if the specified element is null and this list does not support null elements.
     * @throws IllegalArgumentException - if some aspect of the specified element prevents it from being added to this list.
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size()).
     */
    @Override
    public Object set(int index, Object element)throws UnsupportedOperationException,ClassCastException,NullPointerException,IllegalArgumentException,IndexOutOfBoundsException    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns the number of elements in this collection. If this collection contains more than {@code Integer.MAX_VALUE} elements, returns {@code Integer.MAX_VALUE}.
     * @return the number of elements in this collection
     */
    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns a view of the portion of this list between the specified {@code fromIndex}, {@code inclusive}, and {@code toIndex}, exclusive. (If {@code fromIndex} and {@code toIndex} are equal, the returned list is empty.) The returned list is backed by this list, so non-structural changes in the returned list are reflected in this list, and vice-versa. The returned list supports all of the optional list operations supported by this list.
     * This method eliminates the need for explicit range operations (of the sort that commonly exist for arrays). Any operation that expects a list can be used as a range operation by passing a subList view instead of a whole list. For example, the following idiom removes a range of elements from a list:
     * <br>
     *  {@code list.subList(from, to).clear();}
     * <br>
     * Similar idioms may be constructed for {@code indexOf} and {@code lastIndexOf}, and all of the algorithms in the {@code HCollections} class can be applied to a subList.
     * The semantics of the list returned by this method become undefined if the backing list (i.e., this list) is structurally modified in any way other than via the returned list. (Structural modifications are those that change the size of this list, or otherwise perturb it in such a fashion that iterations in progress may yield incorrect results.)
     * @param fromIndex - low endpoint (inclusive) of the subList.
     * @param toIndex - high endpoint (exclusive) of the subList.
     * @return a view of the specified range within this list.
     * @throws IndexOutOfBoundsException - for an illegal endpoint index value (fromIndex < 0 || toIndex > size || fromIndex > toIndex).
     */
    @Override
    public HList subList(int fromIndex, int toIndex)throws IndexOutOfBoundsException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns an array containing all of the elements in this collection. If the collection makes any guarantees as to what order its elements are returned by its iterator, this method must return the elements in the same order.
     * The returned array will be "safe" in that no references to it are maintained by this collection. (In other words, this method must allocate a new array even if this collection is backed by an array). The caller is thus free to modify the returned array.
     * This method acts as bridge between array-based and collection-based APIs.
     * @return an array containing all of the elements in this collection
     */
    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array. If the collection fits in the specified array, it is returned therein. Otherwise, a new array is allocated with the runtime type of the specified array and the size of this collection.
     * If this collection fits in the specified array with room to spare (i.e., the array has more elements than this collection), the element in the array immediately following the end of the collection is set to {@code null}. This is useful in determining the length of this collection only if the caller knows that this collection does not contain any {@code null} elements.)
     * If this collection makes any guarantees as to what order its elements are returned by its iterator, this method must return the elements in the same order.
     * Like the {@code toArray} method, this method acts as bridge between array-based and collection-based APIs. Further, this method allows precise control over the runtime type of the output array, and may, under certain circumstances, be used to save allocation costs
     * Suppose {@code l} is a {@code List} known to contain only strings. The following code can be used to dump the list into a newly allocated array of String:
     * {@code String[] x = (String[]) v.toArray(new String[0]);}
     * Note that {@code toArray(new Object[0])} is identical in function to {@code toArray()}.
     * @param a - the array into which the elements of this collection are to be stored, if it is big enough; otherwise, a new array of the same runtime type is allocated for this purpose.
     * @return an array containing the elements of this collection
     * @throws ArrayStoreException - the runtime type of the specified array is not a supertype of the runtime type of every element in this collection.
     * @throws NullPointerException - if the specified array is null.
     */
    @Override
    public Object[] toArray(Object[] a) throws ArrayStoreException, NullPointerException{
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private class ProtoListIterator implements HListIterator{

        /**
         * Returns {@code true} if the iteration has more elements. (In other words, returns {@code true} if {@code next} would return an element rather than throwing an exception.)
         * @return {@code true} if the iterator has more elements.
         */
        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
        }

        /**
         * Returns the next element in the iteration.
         * @return the next element in the iteration.
         * @throws NoSuchElementException - iteration has no more elements.
         */
        @Override
        public Object next() throws NoSuchElementException {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'next'");
        }

        /**
         * Removes from the underlying collection the last element returned by the iterator (optional operation). This method can be called only once per call to {@code next}. The behavior of an iterator is unspecified if the underlying collection is modified while the iteration is in progress in any way other than by calling this method.
         * @throws UnsupportedOperationException - if the remove operation is not supported by this Iterator.
         * @throws IllegalStateException - if the next method has not yet been called, or the remove method has already been called after the last call to the next method.
         */
        @Override
        public void remove() throws UnsupportedOperationException, IllegalStateException {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'remove'");
        }

        /**
         * Inserts the specified element into the list (optional operation). The element is inserted immediately before the next element that would 
         * be returned by {@code next}, if any, and after the next element that would be returned by {@code previous}, if any. 
         * (If the list contains no elements, the new element becomes the sole element on the list.) 
         * The new element is inserted before the implicit cursor: a subsequent call to next would be unaffected, and a subsequent call to 
         * {@code previous} would return the new element. (This call increases by one the value that would be returned by a call to {@code nextIndex} or {@code previousIndex}.)
         * @param o - the element to insert.
         * @throws UnsupportedOperationException - if the add method is not supported by this list iterator.
         * @throws ClassCastException - if the class of the specified element prevents it from being added to this list.
         * @throws ClassCastException - if some aspect of this element prevents it from being added to this list.
         */
        @Override
        public void add(Object o) throws UnsupportedOperationException,ClassCastException{
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'add'");
        }

        /**
         * Returns {@code true} if this list iterator has more elements when traversing the list in the reverse direction. (In other words, returns {@code true} if {@code previous} would return an element rather than throwing an exception.)
         * @return {@code true} if the list iterator has more elements when traversing the list in the reverse direction.
         */
        @Override
        public boolean hasPrevious() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'hasPrevious'");
        }

        /**
         * Returns the index of the element that would be returned by a subsequent call to {@code next}. (Returns list size if the list iterator is at the end of the list.)
         * @return the index of the element that would be returned by a subsequent call to {@code next}, or list size if list iterator is at end of list.
         */
        @Override
        public int nextIndex() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'nextIndex'");
        }

        /**
         * Returns the previous element in the list. This method may be called repeatedly to iterate through the list backwards, or intermixed with calls to next to go back and forth. (Note that alternating calls to {@code next} and {@code previous} will return the same element repeatedly.)
         * @return the previous element in the list.
         * @throws NoSuchElementException - if the iteration has no previous element.
         */
        @Override
        public Object previous() throws NoSuchElementException {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'previous'");
        }

        /**
         * Returns the index of the element that would be returned by a subsequent call to {@code previous}. (Returns -1 if the list iterator is at the beginning of the list.)
         * @return the index of the element that would be returned by a subsequent call to {@code previous}, or -1 if list iterator is at beginning of list.
         */
        @Override
        public int previousIndex() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'previousIndex'");
        }

        /**
         * Replaces the last element returned by {@code next} or {@code previous} with the specified element (optional operation). This call can be made only if neither {@code ListIterator.remove} nor {@code ListIterator.add} have been called after the last call to {@code next} or {@code previous}.
         * @param o - the element with which to replace the last element returned by next or previous.
         * @throws UnsupportedOperationException - if the set operation is not supported by this list iterator.
         * @throws ClassCastException - if the class of the specified element prevents it from being added to this list.
         * @throws IllegalArgumentException - if some aspect of the specified element prevents it from being added to this list.
         * @throws IllegalStateException - if neither next nor previous have been called, or remove or add have been called after the last call to next or previous.
         */
        @Override
        public void set(Object o) throws UnsupportedOperationException, ClassCastException, IllegalArgumentException,
                IllegalStateException {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'set'");
        }

    }

    private class ProtoIterator implements HIterator{
        /**
         * Returns {@code true} if the iteration has more elements. (In other words, returns {@code true} if {@code next} would return an element rather than throwing an exception.)
         * @return {@code true} if the iterator has more elements.
         */
        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
        }

        /**
         * Returns the next element in the iteration.
         * @return the next element in the iteration.
         * @throws NoSuchElementException - iteration has no more elements.
         */
        @Override
        public Object next() throws NoSuchElementException {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'next'");
        }

        /**
         * Removes from the underlying collection the last element returned by the iterator (optional operation). This method can be called only once per call to {@code next}. The behavior of an iterator is unspecified if the underlying collection is modified while the iteration is in progress in any way other than by calling this method.
         * @throws UnsupportedOperationException - if the remove operation is not supported by this Iterator.
         * @throws IllegalStateException - if the next method has not yet been called, or the remove method has already been called after the last call to the next method.
         */
        @Override
        public void remove() throws UnsupportedOperationException, IllegalStateException {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'remove'");
        }

    }
}