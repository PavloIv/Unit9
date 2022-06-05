package NewArrayList;

import NewLinkedList.MyLinkedList;

public class Main {
    public static void main(String[] args) {
//        MyArrayList newArrayList = new MyArrayList();
//        newArrayList.add("Volvo");
//        newArrayList.add("BMW");
//        newArrayList.add(100);
//        newArrayList.add("Mercedes");
//        newArrayList.add("Tesla");
//        newArrayList.add(121f);
//        newArrayList.add("Honda");
//        newArrayList.add("Nisan");
//        newArrayList.add(130L);
//        newArrayList.add("Toyota");
//        newArrayList.add("Ford");
//        newArrayList.add("Mazda");
//
//        System.out.println("newArrayList = " + newArrayList);
//
//        System.out.println(newArrayList.get(10));
//         newArrayList.add("Mustang");
//        System.out.println("newArrayList = " + newArrayList);
//
//
//        newArrayList.remove(4);
//
//        System.out.println("newArrayList = " + newArrayList);
//
//        newArrayList.clear();
//
//        System.out.println("newArrayList = " + newArrayList);
//
//        newArrayList.add("All good");
//        System.out.println("newArrayList = " + newArrayList);
//
//        System.out.println(newArrayList.size());

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
        System.out.println("newLinkedList = " + newLinkedList.bustMethod());
        newLinkedList.remove(4);

        System.out.println("newLinkedList = " + newLinkedList.bustMethod());




    }
}
