class Solution {
    public int minimumCost(int[] cost) {
        //base case 
        if(cost.length == 1)
        return cost[0];
        else if(cost.length == 2)
        return cost[0] + cost[1];

        //rest of the code
        int ans = 0, j = 1;
        Arrays.sort(cost);
        for(int i = cost.length-1; i>=0; i--)
        {
            if (j % 3 == 0)
            {
                j++;
                continue;
            }
            ans += cost[i];
            j++;
        }
        return ans;
    }
}

