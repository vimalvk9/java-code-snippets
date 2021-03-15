public class NumberOfMatches {

    public static void main(String args[]) {
        System.out.println(numberOfMatches(7));
    }

    public static int numberOfMatches(int n) {

        int matches = 0;
        int teams = n;

        while(teams > 1) {

            if (teams%2 == 0){
                matches += teams/2;
            }
            else{
                matches += (teams-1)/2;
            }

            teams = (teams%2) + (teams/2);
        }

        return matches;
    }
}


