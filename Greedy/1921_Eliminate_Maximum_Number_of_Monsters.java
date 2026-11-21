class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = speed.length;
        double time[] = new double[n];
        int zeroCount = 0;
        for(int i = 0; i<n; i++)
        {
            time[i] = 1D * dist[i] / speed[i];
            if(time[i] == 0.0)
            zeroCount++;
        }
        //base case 
        if(zeroCount >= 2)
        return 1;

        //rest of the code 
        Arrays.sort(time);
        int kill = 1;
        double timeSpent = 1;

        for(int i = 1; i<n; i++)
        {
            double ele = time[i] - timeSpent;
            if(ele > 0)
            kill++;
            else 
            return kill;
            timeSpent++;
        }
        return kill;
    }
}
// 2 2 3 
// 1.5 1.3 
