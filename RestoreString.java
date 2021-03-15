public class RestoreString {

    public static void main(String args[]) {
        System.out.println(restoreString("codeleet" ,new int[]{4,5,6,7,0,2,1,3}));
    }

    public static String restoreString(String s, int[] indices) {

        char[] charArr = new char[indices.length];
        int itr = 0;

        for(int idx: indices){
            charArr[idx] = s.charAt(itr++);
        }

        return String.valueOf(charArr);
    }
}


