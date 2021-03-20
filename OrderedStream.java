import java.util.TreeSet;

public class OrderedStream {

    private TreeSet<Pair> treeSet;

    public OrderedStream(TreeSet<Pair> treeSet) {
        this.treeSet = treeSet;
    }

    public static void main(String args[]) {
        System.out.println("log here");
    }
}

class Pair {

    int id;
    String val;

    Pair(int id, String val){
        this.id = id;
        this.val = val;
    }

    public int getId() {
        return this.id;
    }

    public String getVal() {
        return this.val;

    }
}
