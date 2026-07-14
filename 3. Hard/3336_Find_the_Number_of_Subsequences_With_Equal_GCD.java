class Solution {
    int MOD = 1000000007;
    int t[][][]; //declaring memoization array
    public int subsequencePairCount(int[] nums) {
        t = new int[nums.length + 2][203][203];
        for(int i = 0; i<nums.length; i++)
        {
            for(int j = 0; j<201; j++)
            {
                Arrays.fill(t[i][j], -1);
            } 
        }
        int n = solve(nums, 0, 0, 0) % MOD;
        return n;
    }
    int solve(int nums[], int idx, int first, int second)
    {
        //base case 
        if(idx == nums.length)
        {
            if(first != 0 && second != 0 && first == second)
            return 1;
            return 0;
        }

        if (t[idx][first][second] != -1)
        return t[idx][first][second];

        //rest of the code 
        long skip = solve(nums, idx+1, first, second) %  MOD;
        long take1 = solve(nums, idx+1, gcd(first, nums[idx]), second) % MOD;
        long take2 = solve(nums, idx+1, first, gcd(second, nums[idx])) % MOD;

        return t[idx][first][second] = (int)((skip + take1 + take2) % MOD);
    }
    int gcd(int x, int y) {
        if (x == 0) return y;
        if (y == 0) return x;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
