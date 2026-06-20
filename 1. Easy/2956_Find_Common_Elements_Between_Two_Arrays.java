class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int ele: nums1)
        list.add(ele);
        for(int ele: nums2)
        list1.add(ele);

        //main code
        int ans1 = 0, ans2 = 0; 
        for(int ele: list)
        {
            if (list1.contains(ele))
            ans1++;
        }

        for(int ele: list1)
        {
            if(list.contains(ele))
            ans2++;
        }

        return new int[]{ans1, ans2};
    }
}
