class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length;
        int arr[][] = new int[n][2];
        for(int i = 0; i<n; i++)
        {
            arr[i][0] = plantTime[i];
            arr[i][1] = growTime[i];
        }
        Arrays.sort(arr, (a,b) -> Integer.compare(b[1], a[1]));
        
        int maxDays = 0, prevPlant = 0;
        for(int i = 0; i<n; i++)
        {
            int bloom = prevPlant + arr[i][0] + arr[i][1] + 1;
            maxDays = Math.max(maxDays, bloom);
            prevPlant += arr[i][0];
        }
        return maxDays-1;
    }
}
