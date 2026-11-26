class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: nums)
        {
            if(map.containsKey(ele) == false)
            map.put(ele, 1);
            else 
            map.put(ele, map.get(ele)+1);
        }
        int count = 0;
        for(var ele: map.entrySet())
        {
            int freq = ele.getValue();
            //base case 
            if(freq == 1)
            return -1;

            if(freq % 3 == 0)
            {
                count += freq/3;
            }
            else if(freq == 2)
            count += 1;
            else 
            count += freq/3 + 1;
        }
        return count;
    }
}
