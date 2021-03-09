import java.util.Arrays;

public class MyHashMap {
    
    private int SIZE = 100000001;
    private int[] hashTable;

    /** Initialize your data structure here. */
    public MyHashMap() {
        this.hashTable = new int[SIZE];
        Arrays.fill(hashTable,-1);
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        this.hashTable[key] = value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return this.hashTable[key];
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        this.hashTable[key] = -1;
    }


    public static void main(String args[]) {
        System.out.println("do nothng");
    }

}
