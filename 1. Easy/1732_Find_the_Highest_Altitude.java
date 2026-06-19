class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int key = 0;
        for(int i = 0; i<gain.length; i++)
        {
            key = key + gain[i];
            max = Math.max(max, key);
        }
        return (max < 0)?0:max;
    }
}
