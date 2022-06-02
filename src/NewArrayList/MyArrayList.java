package NewArrayList;

import java.util.Arrays;

public class MyArrayList implements MyList {

    Object[] tempArray;
    private int cursor = 0;

    public MyArrayList() {this.tempArray = new Object[DEFAULT_ARRAY_SIZE];}
    public MyArrayList(int size){this.tempArray = new Object[size];}

    private void increaseArraySize() {
        if (cursor >= tempArray.length) {
            Object[] newTempArray = new Object[tempArray.length * 2];
            for (int i = 0; i < tempArray.length; i++) {
                newTempArray[i] = tempArray[i];
            }
            //newTempArray = Arrays.copyOf(tempArray,tempArray.length);
            tempArray = newTempArray;
        }
    }

    @Override
    public void add(Object value) {
        increaseArraySize();
        tempArray[cursor] = value;
        cursor++;
    }

    @Override
    public void remove(int index) {
        if (index >= 0 && index < cursor){
            tempArray[index] = null;
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = null;
            cursor = 0;
        }
    }

    public int size() {
        int j = 0;
        int colectionSize = 0;
        for (int i = 0; i < tempArray.length; i++) {
            if (null == tempArray[i]){
                j++;
        }
            colectionSize = tempArray.length - j;
        }
        return colectionSize;
    }

    public Object get(int index){
        return tempArray[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(tempArray);
    }
}
