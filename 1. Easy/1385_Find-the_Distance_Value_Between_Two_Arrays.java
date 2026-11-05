class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int ele: arr1)
        {
            boolean check = false;
            for(int j: arr2)
            {
                int dist = Math.abs(ele - j);
                if(dist <= d)
                {
                    check = true;
                    break;
                }
            }
            if(check == false)
                count++;
        }
        return count;
    }
}
