import NewArrayList.MyArrayList;
import NewHashMap.MyHashMap;
import NewLinkedList.MyLinkedList;
import NewQueue.MyQueue;
import NewStack.MyStack;

public class Main {
    public static void main(String[] args) {
        MyArrayList newArrayList = new MyArrayList();
        newArrayList.add("Volvo");
        newArrayList.add("BMW");
        newArrayList.add(100);
        newArrayList.add("Mercedes");
        newArrayList.add("Tesla");
        newArrayList.add(121f);
        newArrayList.add("Honda");
        newArrayList.add("Nisan");
        newArrayList.add(130L);
        newArrayList.add("Toyota");
        newArrayList.add("Ford");
        newArrayList.add("Mazda");

        System.out.println("newArrayList = " + newArrayList);

        System.out.println(newArrayList.get(10));
         newArrayList.add("Mustang");
        System.out.println("newArrayList = " + newArrayList);


        newArrayList.remove(4);

        System.out.println("newArrayList = " + newArrayList);

        newArrayList.clear();

        System.out.println("newArrayList = " + newArrayList);

        newArrayList.add("All good");
        System.out.println("newArrayList = " + newArrayList);

        System.out.println(newArrayList.size());

        MyLinkedList newLinkedList = new MyLinkedList();
        newLinkedList.add("Volvo");
        newLinkedList.add("BMW");
        newLinkedList.add(100);
        newLinkedList.add("Mercedes");
        newLinkedList.add("Tesla");
        newLinkedList.add(121f);
        newLinkedList.add("Honda");
        newLinkedList.add("Nisan");
        newLinkedList.add(130L);
        newLinkedList.add("Toyota");
        newLinkedList.add("Ford");
        newLinkedList.add("Mazda");

        System.out.println("newLinkedList = " + newLinkedList.InputLinkedList());
        newLinkedList.remove(4);

        System.out.println("newLinkedList = " + newLinkedList.InputLinkedList());
        System.out.println("get object = " + newLinkedList.get(6));

        System.out.println("newLinkedList = " + newLinkedList.size());

        newLinkedList.clear();

        System.out.println("newLinkedList = " + newLinkedList.InputLinkedList());

        newLinkedList.add("Mercedes");
        newLinkedList.add("Toyota");
        newLinkedList.add("Ford");
        newLinkedList.add("Mazda");

       System.out.println("newLinkedList = " + newLinkedList.InputLinkedList());


        MyQueue newQueue = new MyQueue();
        newQueue.add("Volvo");
        newQueue.add("BMW");
        newQueue.add(100);
        newQueue.add("Mercedes");
        newQueue.add("Tesla");
        newQueue.add(121f);
        newQueue.add("Honda");
        newQueue.add("Nisan");
        newQueue.add(130L);
        newQueue.add("Toyota");
        newQueue.add("Ford");
        newQueue.add("Mazda");
        System.out.println("newQueue = " + newQueue.InputQueue());
        System.out.println("Size = " + newQueue.size());
        newQueue.remove(7);
        System.out.println("newQueue = " + newQueue.InputQueue());
        System.out.println("Size = " + newQueue.size());
        newQueue.clear();
        System.out.println("newQueue = " + newQueue.InputQueue());
        newQueue.add("Volvo");
        newQueue.add("BMW");
        newQueue.add(100);
        newQueue.add("Mercedes");
        newQueue.add("Tesla");
        newQueue.add(121f);
        newQueue.add("Honda");
        newQueue.add("Nisan");
        System.out.println("newQueue = " + newQueue.InputQueue());
        System.out.println(newQueue.peek());
        System.out.println(newQueue.poll());
        System.out.println("newQueue = " + newQueue.InputQueue());
        System.out.println(newQueue.poll());
        System.out.println("newQueue = " + newQueue.InputQueue());


        MyStack newStack = new MyStack();
        newStack.push("Pig");
        newStack.push("Dog");
        newStack.push(13);
        newStack.push("Rabbit");
        newStack.push("Chicken");
        newStack.push(123.215f);
        newStack.push("Cat");

        System.out.println("newStack = " + newStack.InputStack());

        newStack.remove(3);

        System.out.println("newStack = " + newStack.InputStack());

        newStack.clear();

        System.out.println("newStack = " + newStack.InputStack());

        newStack.push("Dog");
        newStack.push(13);
        newStack.push("Rabbit");
        newStack.push("Chicken");
        newStack.push(123.215f);
        newStack.push("Cat");

        System.out.println("newStack = " + newStack.InputStack());

        System.out.println(newStack.size());

        System.out.println(newStack.peek());

        System.out.println(newStack.pop());

        System.out.println("newStack = " + newStack.InputStack());

        MyHashMap<String,String> newHashMap = new MyHashMap<>();
        newHashMap.put("Rex","Dog");
        newHashMap.put("Red","Cat");

        System.out.println("newHashMap = " + newHashMap.size());
        newHashMap.clear();
        System.out.println("newHashMap = " + newHashMap.size());

        newHashMap.put("Rex","Dog");
        System.out.println("newHashMap = " + newHashMap.toString());
        newHashMap.put("Red","Cat");
        newHashMap.put("Pink","Pig");


        System.out.println("newHashMap = " + newHashMap.size());
        newHashMap.remove("Red");
        System.out.println("newHashMap = " + newHashMap.size());
        System.out.println("newHashMap = " + newHashMap.get("Red"));
        System.out.println("newHashMap = " + newHashMap.get("Pink"));



    }
}
