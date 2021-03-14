public class BalancedStringsSplit {

    public static void main(String args[]) {
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
    }

    public static int balancedStringSplit(String s) {

        char[] arr = s.toCharArray();
        int R = 0, L = 0;

        int result = 0;

        for(char ch: arr) {
            if (ch == 'R') {
                R++;
            }
            else {
                L++;
            }

            if (R == L) {
                result++;
                L = 0;
                R = 0;
            }
        }

        return result;
    }
}


