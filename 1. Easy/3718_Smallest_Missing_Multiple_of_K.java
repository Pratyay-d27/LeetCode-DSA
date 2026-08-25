class Solution {
    public int missingMultiple(int[] nums, int k) {
        int freq[] = new int[102];
        for(int ele: nums)
        freq[ele] = 1;

        for(int i = 1; i<52; i++)
        {
            int key = k*i;
            if(key > 100)
            break;
            if(freq[key] == 0)
            return key;
        }
        int num = k;
        while(num <= 100)
            num += k;
        return num;
    }
}
