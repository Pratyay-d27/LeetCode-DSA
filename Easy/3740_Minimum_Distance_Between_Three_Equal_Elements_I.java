class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int matrix[][] = new int[n][3];
        for(int i = 0; i<n; i++)
        {
            matrix[i][0] = i;
            int j = i+1, k;
            while(j < n && nums[j] != nums[i])
            j++;
            if(j < n)
            matrix[i][1] = j;
            k = j+1;
            while(k < n && nums[k] != nums[i])
            k++;
            if(k < n)
            matrix[i][2] = k;
        }
        int min = Integer.MAX_VALUE;
        for(int p = 0; p<n; p++)
        {
            int i = matrix[p][0], j = matrix[p][1], k = matrix[p][2];
            if(matrix[p][1] != 0 && matrix[p][2] != 0)
            {
                int d = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                if(d < min)
                min = d;
            }
        }
        if(min != Integer.MAX_VALUE)
        return min;
        return -1;
    }
}
