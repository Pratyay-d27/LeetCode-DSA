class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int freq[] = new int[101];
        for(int i = 0; i<nums.length; i++)
        freq[nums[i]]++;

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<freq.length; i++)
        {
            if(freq[i] != 0)
            {
                if(freq[i] <= k)
                {
                    for(int j = 0; j<freq[i]; j++)
                    list.add(i);
                }
                else if(freq[i]>k)
                {
                    for(int j = 0; j<k; j++)
                    list.add(i);
                }
            }
        }
        int arr[] = new int[list.size()];
        for(int i = 0; i<list.size(); i++)
        arr[i] = list.get(i);
        return arr;
    }
}
