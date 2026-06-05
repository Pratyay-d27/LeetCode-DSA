class Solution {
    public int digitFrequencyScore(int n) {
        int freq[] = new int [10];
        int k = n;
        while(n>0)
        {
            int d = n%10;
            freq[d]++;
            n = n/10;
        }
        int cost = 0;
        for(int i = 0; i<freq.length; i++)
        {
            if(freq[i] != 0)
            cost += i * freq[i];
        }
        return cost;
    }
}
