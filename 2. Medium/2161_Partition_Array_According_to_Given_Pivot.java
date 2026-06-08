class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length, index = 0, equal = 0;
        int arr[] = new int[n];
        for(int i = 0; i<n; i++)
        {
            //all elements less than pivot 
            if(nums[i] < pivot)
            {
                arr[index++] = nums[i];
                nums[i] = 1000001;
            }
            if(nums[i] == pivot)
            {
                nums[i] = 1000001;
                equal++;
            }
        }
        for(int i = 0; i<equal; i++)
        {
            //elements equal to pivot 
            arr[index++] = pivot;
        }
        for(int i = 0; i<n; i++)
        {
            //elements greater than pivot 
            if(nums[i] != 1000001)
            arr[index++] = nums[i];
        }
        return arr;
    }
}
