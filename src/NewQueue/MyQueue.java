package NewQueue;

import NewArrayList.MyList;
public class MyQueue<E> implements MyList {
    int countElem = -1;
    int size = 0;
    ObjectQueue<E> first;
    ObjectQueue<E> last;
    @Override
    public void add(Object value) {
        ObjectQueue<E> theLast =  last;
        ObjectQueue<E> newObjectLL = new ObjectQueue<>( (E)value, null);
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
    public void remove(int index) {
        int countBust = 0;
        ObjectQueue<E> bust = first;
        ObjectQueue<E> changeLink = null;

        for (; countBust < index; countBust++) {
            changeLink = bust;
            bust = bust.next;
        }
        changeLink.next = bust.next;
        bust = null;
        countElem--;
        size--;
    }

    @Override
    public void clear() {
        ObjectQueue<E> temp = first;
        ObjectQueue<E> next = null;
        for (;temp != null ; ) {
            next = temp.next;
            temp.elementQueue = null;
            temp.next = null;
            temp = next;
        }
        first = last = null;
        countElem = -1;
        size = 0;
    }
    public int size(){
        return size;
    }

    public E peek(){
       try {
           return (E) first.elementQueue;
       }catch (NullPointerException e){
           System.out.println("First element si not found");
       }
        return null;
    }

    public E poll(){
        ObjectQueue<E> temp = first.next;
        Object ret = first.elementQueue;
        first.elementQueue = null;
        first.next = null;
        first = temp;
        countElem--;
        return (E) ret;

    }

    public String InputQueue(){
        int countBust = 0;
        StringBuilder bustResult = new StringBuilder();
        ObjectQueue<E> bust = first;
        if (bust == null){countBust++;}
        while (countBust <= countElem) {
            bustResult.append(bust.elementQueue.toString()).append(" ");
            bust = bust.next;
            countBust++;
        }
        return bustResult.toString();
    }

}

class ObjectQueue <E>{
    E elementQueue;
    ObjectQueue<E> next;

    public ObjectQueue(E elementQueue, ObjectQueue<E> next) {
        this.elementQueue = elementQueue;
        this.next = next;
    }
}
