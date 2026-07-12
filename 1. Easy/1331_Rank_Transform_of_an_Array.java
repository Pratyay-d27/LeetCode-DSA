class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int brr[] = arr.clone();
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(brr);
        int key = 1;
        for(int ele: brr)
        {
            if(map.containsKey(ele) == false)
            {
                map.put(ele, key);
                key++;
            }
        }
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
