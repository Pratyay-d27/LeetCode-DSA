class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length;
        int turns = n / 3;
        Arrays.sort(piles);
        int score = 0;
        for(int i = n-2; n >= 0 && turns > 0; i=i-2, turns--)
        {
            score += piles[i];
        }
        return score;
    }
}
