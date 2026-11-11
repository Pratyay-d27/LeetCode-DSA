class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if(need1 == 0 && need2 == 0)
        return 0;

        if(cost1 + cost2 <= costBoth)
        return 1L * need1*cost1 + 1L * need2*cost2;
    
        //else condition
        int minNeed = Math.min(need1, need2);
        long total = 1L * minNeed * costBoth;
        need1 -= minNeed;
        need2 -= minNeed;

        if(need1 > 0)
        {
            total += 1L * need1 * (Math.min(cost1, costBoth));
        }
        else if(need2 > 0)
        {
            total += 1L * need2 * (Math.min(cost2, costBoth));
        }
        return total;
    }
}
