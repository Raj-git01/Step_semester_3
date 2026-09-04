public class BestTimeToBuySellStock {

    static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int minPriceSoFar = prices[0];
        int maxProfitSoFar = 0;

        for (int i = 1; i < prices.length; i++) {
            int profitToday = prices[i] - minPriceSoFar;
            if (profitToday > maxProfitSoFar) {
                maxProfitSoFar = profitToday;
            }
            if (prices[i] < minPriceSoFar) {
                minPriceSoFar = prices[i];
            }
        }
        return maxProfitSoFar;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7, 1, 5, 3, 6, 4})); // 5
        System.out.println(maxProfit(new int[] {7, 6, 4, 3, 1}));    // 0
    }
}
