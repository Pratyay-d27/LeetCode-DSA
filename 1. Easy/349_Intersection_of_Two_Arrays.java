class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele: nums1)
        list.add(ele);

        for(int ele: nums2)
        {
            if(list.contains(ele))
            set.add(ele);
        }
        int arr[] = new int[set.size()]; //final array to be returned 
        int i = 0;
        for(int ele: set)
        {
            arr[i] = ele;
            i++;
        }
        return arr; //returning final array
    }
}
