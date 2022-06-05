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
        countElem++;
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
    }

    @Override
    public void clear() {

    }

    public String bustMethod(){
        int countBust = 0;
        StringBuilder bustResult = new StringBuilder();
        ObjectLinkedList<E> bust = first;
        while (countBust < countElem) {
            bustResult.append(bust.elLinkedList.toString()).append(" , ");
            bust = bust.next;
            countBust++;
        }
        return bustResult.toString();
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