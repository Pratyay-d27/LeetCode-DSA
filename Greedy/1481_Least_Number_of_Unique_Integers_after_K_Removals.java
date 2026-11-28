class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: arr)
        {
            if(map.containsKey(ele) == false)
            map.put(ele, 1);
            else 
            map.put(ele, map.get(ele)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(var ele: map.entrySet())
        {
            int value = ele.getValue();
            list.add(value);
        }
        Collections.sort(list);
        int n = list.size();
        for(int ele: list)
        {
            if(k >= ele)
            {
                n--;
                k -= ele;
            }
        }
        return n;
    }
}
