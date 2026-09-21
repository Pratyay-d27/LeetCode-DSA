class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int n = intervals.length, count = 0;
        for(int i = 0; i<n; i++)
        {
            int key1 = intervals[i][0];
            int key2 = intervals[i][1];
            for(int j = i+1; j<n; j++)
            {
                int key3 = intervals[j][0];
                int key4 = intervals[j][1];
                if( key3 <= key2 && (key3 >= key1 || key4 >= key1) )
                count++;
            }
        }
        return count;
    }
} 
