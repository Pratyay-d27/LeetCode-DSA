class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++)
            {
                int ele = nums[i];
                if(map.containsKey(ele) == false)
                {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i);
                    map.put(ele, list);
                }
                else 
                {
                    ArrayList<Integer> list;
                    list = map.get(ele);
                    list.add(i);
                    map.put(ele, list);
                }
            }
        int count = 0;
        for(var ele: map.entrySet())
            {
                int key = ele.getKey();
                ArrayList<Integer> list = ele.getValue();
                if(list.size() != 3)
                continue;
                else 
                {
                    int i = list.get(0);
                    int j = list.get(1);
                    int k = list.get(2);
                    if((i < j && j < k) && (j - i) == (k - j))
                    count++;
                }
            }
        return count;
    }
}
