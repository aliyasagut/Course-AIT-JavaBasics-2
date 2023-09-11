package lesson38_39.linkedList_Implementation;

import java.util.Iterator;

public class OurLinkedList<E> implements OurList<E> {

    private int size;
    private Node<E> first;
    private Node<E> last;

    public OurLinkedList() {

    }

    @Override
    public void append(E value) {

        if (size > 0) {
            Node<E> newNode = new Node<>(null, last, value);
            last.next = newNode;
            last = newNode;

        } else {
            Node<E> newNode = new Node<>(null, null, value);
            first = newNode;
            last = newNode;
        }
        size++;
    }

    @Override
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> needle = getNode(index);

        return needle.value;
    }

    private Node<E> getNode(int index) {
        Node<E> needle = first;
        for (int i = 0; i < index; i++) {
            needle = needle.next;
        }
        return needle;
    }

    @Override
    public void set(E o, int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> needle = getNode(index);
        needle.value = o;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E o) {
        Node<E> needle = first;
        for (int i = 0; i < size; i++) {
            if (needle.value.equals(o)) {
                return true;
            }
            needle = needle.next;
        }
        return false;
    }

    @Override
    public boolean remove(E o) {
        Node<E> needle = first;
        for (int i = 0; i < size; i++) {
            if (needle.value.equals(o)) {
                removeByID(i);
                return true;
            }
            needle = needle.next;
        }
        return false;
    }

    @Override
    public E removeByID(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> nodeToRemove = getNode(index);
        Node<E> left = nodeToRemove.prev;
        Node<E> right = nodeToRemove.next;

        if (index > 0 && index < size - 1) {
            nodeToRemove.next = null;
            nodeToRemove.prev = null;

            left.next = right;
            right.prev = left;
        } else if (index == 0) {
            right.prev = null;
            first = right;
        } else {
            left.next = null;
            left = last;
        }
        size--;
        return nodeToRemove.value;
    }

    public Iterator<E> iterator(){
        return new OurLinkedListIterator();
    }

    private class OurLinkedListIterator implements Iterator<E>{

        Node<E> currentNode = first;

        public boolean hasNext(){
            return currentNode != null;
        }
        public E next(){
            E res = currentNode.value;
            currentNode = currentNode.next;

            return res;
        }
    }


    private static class Node<E> {

        Node<E> next;
        Node<E> prev;
        E value;

        Node() {
        }

        Node(Node<E> next, Node<E> prev, E value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }


    }


}
