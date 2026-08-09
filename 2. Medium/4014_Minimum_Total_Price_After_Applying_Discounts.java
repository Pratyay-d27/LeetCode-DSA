class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i = prices.length-1, j = discounts.length-1;
        double cost = 0;
        while(i>=0 && j>=0)
        {
            cost += (prices[i] * (100 - discounts[j])) / 100.0;
            i--;
            j--;
        }
        while(i>=0)
        cost += prices[i--];

        return cost;
    }
}
