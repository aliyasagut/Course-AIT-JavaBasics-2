package lesson38_39.linkedList_Implementation;

public interface OurList <E> extends Iterable<E> {

    void append(E o);
    E get(int index);
    void set(E o, int index);
    int size();
    boolean contains(E o);
    boolean remove(E o);
    E removeByID(int index);

}
