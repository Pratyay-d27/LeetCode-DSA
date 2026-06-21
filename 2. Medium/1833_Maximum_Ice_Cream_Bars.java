class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int bars = 0, i = 0;
        while(i < costs.length && coins > 0)
        {
            if(coins - costs[i] >= 0)
            {
                coins -= costs[i];
                bars++;
            }
            i++;
        }
        return bars;
    }
}
