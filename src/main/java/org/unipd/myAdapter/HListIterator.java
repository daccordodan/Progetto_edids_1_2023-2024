package org.unipd.myAdapter;
/**
 * <p>An iterator for lists that allows the programmer to traverse the list in either direction, modify the list during iteration, 
 * and obtain the iterator's current position in the list. A {@code ListIterator} has no current element; its cursor position always lies between 
 * the element that would be returned by a call to {@code previous()} and the element that would be returned by a call to {@code next()}. In a list of length {@code n}, 
 * there are {@code n+1} valid index values, from {@code 0} to {@code n}, inclusive.</p>
 * 
 * {@code
 *           Element(0)   Element(1)   Element(2)   ... Element(n)   
 *         ^            ^            ^            ^               ^
 *  Index: 0            1            2            3               n+1
 * }
 *  
 * <p>Note that the {@code remove()} and {@code set(Object)} methods are not defined in terms of the cursor position; they are defined to operate on the last element returned by a call to {@code next()} or {@code previous()}.</p>
 * 
 * @author dacco
 */

public interface HListIterator extends HIterator{
    void add(Object o);

    /**
     * Returns {@code true} if this list iterator has more elements when traversing the list in the reverse direction. (In other words, returns {@code true} if {@code previous} would return an element rather than throwing an exception.)
     * @return {@code true} if the list iterator has more elements when traversing the list in the reverse direction.
     */
    boolean hasPrevious();

    /**
     * Returns the index of the element that would be returned by a subsequent call to {@code next}. (Returns list size if the list iterator is at the end of the list.)
     * @return the index of the element that would be returned by a subsequent call to {@code next}, or list size if list iterator is at end of list.
     */
    int nextIndex();

    /**
     * Returns the previous element in the list. This method may be called repeatedly to iterate through the list backwards, or intermixed with calls to next to go back and forth. (Note that alternating calls to {@code next} and {@code previous} will return the same element repeatedly.)
     * @return the previous element in the list.
     * @throws NoSuchElementException - if the iteration has no previous element.
     */
    Object previous()throws NoSuchElementException;

    /**
     * Returns the index of the element that would be returned by a subsequent call to {@code previous}. (Returns -1 if the list iterator is at the beginning of the list.)
     * @return the index of the element that would be returned by a subsequent call to {@code previous}, or -1 if list iterator is at beginning of list.
     */
    int previousIndex();

    /**
     * Replaces the last element returned by {@code next} or {@code previous} with the specified element (optional operation). This call can be made only if neither {@code ListIterator.remove} nor {@code ListIterator.add} have been called after the last call to {@code next} or {@code previous}.
     * @param o - the element with which to replace the last element returned by next or previous.
     * @throws UnsupportedOperationException - if the set operation is not supported by this list iterator.
     * @throws ClassCastException - if the class of the specified element prevents it from being added to this list.
     * @throws IllegalArgumentException - if some aspect of the specified element prevents it from being added to this list.
     * @throws IllegalStateException - if neither next nor previous have been called, or remove or add have been called after the last call to next or previous.
     */
    void set(Object o) throws UnsupportedOperationException,ClassCastException,IllegalArgumentException,IllegalStateException;
}