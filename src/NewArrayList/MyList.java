package NewArrayList;

public interface MyList <E>{
    static final int DEFAULT_ARRAY_SIZE = 10;

    void add(E value);

    void remove(int index);

    void clear();
}
