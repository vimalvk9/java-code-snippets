public class FollPat {

    public static void main(String args[]) {
        System.out.println(follPatt("yyxxyyxxyyxx"));
    }

    public static byte follPatt(String s)
    {
        int len = s.length();
        if (len%2 == 1) {
            return 0;
        }

        String countStr = getCountString(s);
        System.out.println(countStr);

        if (countStr.length()%4 != 0){
            return 0;
        }

        for(int i=0; i<=countStr.length()-4; i+=4){
            System.out.println(countStr.charAt(i)  + " " + countStr.charAt(i+1) + " " + countStr.charAt(i+2) + " " + countStr.charAt(i+3));
            if (countStr.charAt(i) == 'x' && countStr.charAt(i+2) == 'y' && (countStr.charAt(i+1) == countStr.charAt(i+3))){
                continue;
            }
            return 0;
        }
        return 1;
    }

    private static String getCountString(String s) {
        StringBuilder newStr = new StringBuilder();
        char curChar = s.charAt(0);
        byte curCt = 1;

        for(int i=1; i<s.length(); i++){

            if (curChar == s.charAt(i)){
                curCt++;
            }
            else{
                newStr.append(curChar);
                newStr.append(curCt);

                curChar = s.charAt(i);
                curCt = 1;
            }
        }

        // tail
        newStr.append(curChar);
        newStr.append(curCt);
        return newStr.toString();
    }


}


