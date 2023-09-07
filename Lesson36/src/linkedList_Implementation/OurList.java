package linkedList_Implementation;

public interface OurList<E> extends Iterable<E>{
    void append(E o);
    E get(int index);
    int size();
    boolean contains(E o);
    boolean remove(E o);
    E removeById(int index);


}
