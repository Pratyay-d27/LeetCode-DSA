class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int freq[] = new int[10002];
        for(int i = 0; i<banned.length; i++)
        {
            freq[banned[i]]++;
        }

        int sum = 0, count = 0;
        for(int i = 1; i<=n; i++)
        {
            if(freq[i] == 0)
            {
                sum += i;
                if(sum <= maxSum)
                count++;
            }
        }
        return count;
    }
}
