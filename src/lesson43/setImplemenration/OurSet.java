package lesson43.setImplemenration;

public interface OurSet<E> extends Iterable<E> {

    /*
    adds element to the set
    @param elt to add
    @return true if set was changed
     */
    boolean add(E elt);

    /*
    removes an element from the set
    @param elt to remove
    @return true if the set was changed
     */
    boolean remove(E elt);

    /*
    checks if the element is in the set
    @param elt to find
    @return true is the set contains the elt
     */
    boolean contains(E elt);

    int size();

}
