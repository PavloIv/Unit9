package NewStack;

public class MyStack<E> {
        int countElem = -1;
        int size = 0;
        ObjectStack<E> first;
        ObjectStack<E> last;

        public void push(Object value) {
            ObjectStack<E> theLast =  last;
            ObjectStack<E> newObjectStack = new ObjectStack<>((E) value,  theLast);
            last =newObjectStack;
            if(theLast == null) {
                first = newObjectStack;
            }
            size++;
            countElem++;
        }

        public void remove(int index) {
            int countBust = 0;
            ObjectStack<E> bust = last;
            ObjectStack<E> changeLink = null;

            for (; countBust < index; countBust++) {
                changeLink = bust;
                bust = bust.previous;
            }
            changeLink.previous = bust.previous;
            bust = null;
            countElem--;
            size--;
        }
        public void clear() {
            ObjectStack<E> temp = last;
            ObjectStack<E> prev = null;
            for (;temp != null ; ) {
                prev = temp.previous;
                temp.elementStack = null;
                temp.previous = null;
                temp = prev;
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
                return (E) last.elementStack;
            }catch (NullPointerException e){
                System.out.println("First element si not found");
            }
            return null;
        }

        public E pop(){
            ObjectStack<E> temp = last.previous;
            Object ret = last.elementStack;
            last.elementStack = null;
            last.previous = null;
            last = temp;
            countElem--;
            return (E) ret;

        }

        public String InputStack(){
            int countBust = 0;
            StringBuilder bustResult = new StringBuilder();
            ObjectStack<E> bust = last;
            if (bust == null){countBust++;}
            while (countBust <= countElem) {
                bustResult.append(bust.elementStack.toString()).append(" ");
                bust = bust.previous;
                countBust++;
            }
            return bustResult.toString();
        }
}
class ObjectStack <E>{
    E elementStack;
    ObjectStack<E> previous;

    public ObjectStack(E elementStack, ObjectStack<E> previous) {
        this.elementStack = elementStack;
        this.previous = previous;
    }
}