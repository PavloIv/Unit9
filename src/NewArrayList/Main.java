package NewArrayList;

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



    }
}
