package linkedlist_implementation.code;

import java.util.Iterator;

public class OurLinkedList<E> implements OurList<E>, Iterator<E> {

    private int size;
    private Node<E> first;
    private Node<E> last;
    private Node<E> activeNode;

    public OurLinkedList() {
    }


    @Override
    public void append(E value) {

        if (size > 0) {
            Node<E> newNode = new Node<>(last, value, null);
            last.next = newNode;
            last = newNode;


        } else {
            Node<E> newNode = new Node<>(null, value, null);
            first = newNode;
            last = newNode;
        }
        size++;
    }


    private Node<E> getNodeByIndex(int index) {
        if (index >= size || index < 0) {
            return null;
        } else {
            int currentIndex = 0;
            Node<E> currentNode = first;
            while (currentIndex < index) {
                currentNode = currentNode.next;
                currentIndex++;
            }
            return currentNode;
        }

    }

    @Override
    public E get(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        return getNodeByIndex(index).value;
    }

    @Override
    public void set(E object, int index) {
        if (index >= size || index < 0) {
            return;
        }
        getNodeByIndex(index).value = object;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E o) {
        Node<E> currentNode = first;
        while (currentNode != null) {
            if (currentNode.value.equals(o)) return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public boolean remove(E o) {
        return false;
    }

    @Override
    public E removeById(int index) {
//        Node<E> deletedNode = getNodeByIndex(index);
//        if (deletedNode != null) {
//            E value = deletedNode.value;
//            if (deletedNode == first) {
//                first = deletedNode.next;
//                if (deletedNode.next != null) {
//                    deletedNode.next.prev = null;
//                }
//            }
//            if (deletedNode == last) {
//                last = deletedNode.prev;
//                if (deletedNode.prev != null) {
//                    deletedNode.prev.next = null;
//                }
//            }
//            if (deletedNode != first && deletedNode != last) {
//                deletedNode.next.prev = deletedNode.prev;
//                deletedNode.prev.next = deletedNode.next;
//                deletedNode.prev = null;
//                deletedNode.next = null;
//                deletedNode.value = null;
//            }
//            return value;
//        }
//        return null;
        Node<E> deletedNode = getNodeByIndex(index);
        if (deletedNode != null) {

            E value = deletedNode.value;
            Node<E> prev = deletedNode.prev;
            Node<E> next = deletedNode.next;
            if (prev == null && next == null) {
                first = null;
                last = null;
                size = 0;
                return deletedNode.value;
            }


            if (prev != null) {
                prev.next = next;
            } else {
                first = next;
                first.prev = null;
            }

            if (next != null) {
                next.prev = prev;
            } else {
                last = prev;
                last.next = null;
            }
            size--;
        }
        return null;
    }

    public void printLinkedList() {
        int index = 0;
        while (get(index) != null) {
            System.out.println(get(index));
            index++;
        }
    }

    public void printLinkedList2() {
        String[] list = new String[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = String.valueOf(get(i));
        }
        for (String s : list) {
            System.out.println(s);
        }
    }

    public void print() {
        Node<E> currentNode = first;
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    @Override
    public Iterator<E> iterator() {
        activeNode = first;
        return this;
    }

    @Override
    public boolean hasNext() {
        return activeNode != null;
    }

    @Override
    public E next() {
        if (hasNext()){
            E value = activeNode.value;
            activeNode = activeNode.next;
            return value;
        } else {
            return null;
        }

    }

    private static class Node<E> {
        Node<E> prev;

        E value;

        Node<E> next;

        Node(Node<E> prev, E value, Node<E> next) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }
    }
}
