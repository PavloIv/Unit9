package NewHashMap;


import java.util.Arrays;
import java.util.Objects;

public class MyHashMap<K,V> {
    int size = 0;
    ObjectHashMap[] hashArray;
    public MyHashMap() {
    this.hashArray = new ObjectHashMap[8];
    }
    public MyHashMap(int sizeHashArray) {
        this.hashArray = new ObjectHashMap[sizeHashArray];
    }
    public  void put(Object key, Object value){
        ObjectHashMap<K, V> newElement = new ObjectHashMap<>((K)key,(V)value);
        ObjectHashMap temp = hashArray[counterInHashArray(newElement.hashCode())];
            if (temp == null){
                hashArray[counterInHashArray(newElement.hashCode())] = newElement;
                size++;
            }else {
                while (temp.next != null) {
                    if (Objects.equals(temp.getKey(), newElement.getKey())) {
                        newElement.next = temp.next;
                        temp = newElement;
                        break;
                    }
                    temp = temp.next;
                }
                temp.next = newElement;
                size++;
            }
    }
    public  void remove(Object key){
        ObjectHashMap<K,V> newElement = new ObjectHashMap<K, V>(key,null);
        ObjectHashMap temp = hashArray[counterInHashArray(newElement.hashCode())];
            if(temp != null){
                while (temp.next != null){
                    if (Objects.equals(temp.next.getKey(), newElement.getKey())){
                        temp.next = temp.next.next;
                        size--;
                        break;
                    }
                }
            }
     }
     public void clear() {
        Arrays.fill(hashArray, null);
        size = 0;
     }
     public int size() {
        return size;
     }
    public V get(Object key){
    ObjectHashMap<K,V> newElement = new ObjectHashMap<>((K)key,null);
    ObjectHashMap<K,V> temp = hashArray[counterInHashArray(newElement.hashCode())];
    if (temp != null){
       if (Objects.equals(temp.getKey(), newElement.getKey())){
        return  temp.getValue();
        }else {
           while (temp.next != null){
               temp = temp.next;
               if (Objects.equals(temp.getKey(), newElement.getKey())){
                   return temp.getValue();
               }
           }
       }
    }
    return null;
    }
    private int counterInHashArray(int hash) {
        int counterInHashArray = hash % hashArray.length;
        while (hash > hashArray.length) {
            hash --;
        }
        return counterInHashArray;
    }
}
class ObjectHashMap<K, V>{
    private K key;
    private V value;
    ObjectHashMap<K,V> next;
    public ObjectHashMap() {
        this.key = key;
        this.value = value;
        this.next = next;
    }
    public <K, V> ObjectHashMap(K key, V value) {
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectHashMap<?, ?> that = (ObjectHashMap<?, ?>) o;
        return key.equals(that.key);
    }
    @Override
    public String toString() {
        return "" + key + " = " + value;

    }
    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
