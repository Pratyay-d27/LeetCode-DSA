class Solution {
    public int diagonalPrime(int[][] nums) {
        int max = Integer.MIN_VALUE, n = nums.length;
        // first diagonal
        for(int i = 0; i<n; i++)
        {
            if(isPrime(nums[i][i]))
            max = Math.max(max, nums[i][i]);
        }

        //2nd diagonal
        for(int i = n-1; i>=0; i--)
        {
            int ele = nums[i][n - 1 - i];
            if(isPrime(ele))
            max = Math.max(max, ele);
        }
        return max == Integer.MIN_VALUE?0:max;
    }
    boolean isPrime(int n) {
        if (n <= 1) return false;
        
        if (n <= 3) return true;

        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
