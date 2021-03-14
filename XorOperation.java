public class XorOperation {

    public static void main(String args[]) {
        System.out.println(xorOperation(10,5));
    }

    public static int xorOperation(int n, int start) {
        int result = 0;

        for(int itr=0; itr<n; itr++) {
            result ^= (start + (2*itr));
        }

        return result;
    }
}


