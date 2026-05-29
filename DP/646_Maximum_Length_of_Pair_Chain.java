//Recursion + Memoization Approach

class Solution {
    int t[][] = new int[1001][1001];
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b)->Integer.compare(a[0], b[0]));
        for(int i = 0; i<1001; i++)
        {
            Arrays.fill(t[i], -1);
        }
        return solve(pairs, 0, -1);
    }
    int solve(int [][] pairs, int i, int prev)//i points to the present row
    {
        if(i>=pairs.length)
        return 0;

        if(prev != -1 && t[i][prev] != -1)
        return t[i][prev];

        int take = 0, skip = 0;
        if(prev ==-1 || pairs[prev][1]<pairs[i][0])
        take = 1 + solve(pairs, i+1, i);
        skip = solve(pairs, i+1, prev);

        if (prev == -1)
        return Math.max(take, skip);
        return t[i][prev] = Math.max(take, skip);
    }
}
