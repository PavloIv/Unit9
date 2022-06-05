package NewLinkedList;

import NewArrayList.MyList;

import java.util.Arrays;
import java.util.LinkedList;

public class MyLinkedList<E>  implements MyList {
    int countElem = 0;
    int size = 0;
    ObjectLinkedList<E> first;
    ObjectLinkedList<E> last;

    void addFirst(E element){
        ObjectLinkedList<E> theFirst = first;
        ObjectLinkedList<E> newObjectLL = new ObjectLinkedList<>(element,theFirst,null);
        first = newObjectLL;
        if (theFirst == null){
            last = newObjectLL;
        }else {
            theFirst.previous = newObjectLL;
        }
//        countElem++;
        size++;
    }

    void addLast(E element){
        ObjectLinkedList<E> theLast =  last;
        ObjectLinkedList<E> newObjectLL = new ObjectLinkedList<>( element, null, theLast);
        last =newObjectLL;
        if(theLast == null) {
            first = newObjectLL;
        }else {
            theLast.next = newObjectLL;
        }
        size++;
        countElem++;
}
    @Override
    public void add(Object value) {
        if (size == 0){
        addFirst((E) value);
        }else {
        addLast((E) value);
        }
    }

    @Override
    public void remove(int index) {
        int countBust = 0;
        ObjectLinkedList<E> bust = first;
        ObjectLinkedList<E> changeNextLink = null;
        ObjectLinkedList<E> changePreviousLink = null;
        for (; countBust < index; countBust++) {
            bust = bust.next;
        }
        changeNextLink = bust.previous;
        changePreviousLink = bust.next;
        changeNextLink.next = changePreviousLink;
        changePreviousLink.previous = changeNextLink;

        bust = null;
        countElem--;
        size--;
    }

    @Override
    public void clear() {
        ObjectLinkedList<E> temp = last;
        ObjectLinkedList<E> prev = null;
        for (;temp != null ; ) {
            prev = temp.previous;
            temp.elLinkedList = null;
            temp.next = null;
            temp.previous = null;
            temp = prev;
        }
        first = last = null;
        countElem = 0;
        size = 0;
    }

    public String InputLinkedList(){
        int countBust = 0;
        StringBuilder bustResult = new StringBuilder();
        ObjectLinkedList<E> bust = first;
        if (bust == null){countBust++;}
        while (countBust <= countElem) {
            bustResult.append(bust.elLinkedList.toString()).append(" ");
            bust = bust.next;
            countBust++;
        }
        return bustResult.toString();
    }
    public int size(){
        return size;
    }
    public E get(int index){
        int countBust = 0;
        ObjectLinkedList<E> bust = first;
        for (; countBust < index; countBust++) {
            bust = bust.next;
        }
        return (E) bust.elLinkedList.toString();

    }
}

class ObjectLinkedList <E>{
    E elLinkedList;
    ObjectLinkedList <E> next;
    ObjectLinkedList <E> previous;

    public ObjectLinkedList(E elLinkedList, ObjectLinkedList<E> next, ObjectLinkedList<E> previous) {
        this.elLinkedList = elLinkedList;
        this.next = next;
        this.previous = previous;
    }
}