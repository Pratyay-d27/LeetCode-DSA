class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        boolean pres[] = new boolean[102];
        for(int ele: nums) // to find the max and min values of the array 
        {
            pres[ele] = true;
            max = Math.max(ele, max);
            min = Math.min(ele, min);
        }
        List<Integer> list = new ArrayList<>();
        for(int i = min; i<= max; i++)
        {
            if(pres[i] == false)
            list.add(i);
        }
        return list;
    }
}
