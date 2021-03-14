public class RichestCustomerWealth {

    public static void main(String args[]) {

        int [][] arr = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {

        int maxWealth = accounts[0][0];

        for(int[] person: accounts) {

            int currentMaxWealth = 0;

            for(int bankMoney: person){
                currentMaxWealth += bankMoney;
            }

            maxWealth = Math.max(maxWealth, currentMaxWealth);
        }

        return maxWealth;
    }
}
