package NewArrayList;

public interface MyList {
    static final int DEFAULT_ARRAY_SIZE = 10;

    void add(Object value);

    void remove(int index);

    void clear();
}
