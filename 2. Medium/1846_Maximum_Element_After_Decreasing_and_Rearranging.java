class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);//sorting the array
        if(arr[0] != 1)
        arr[0] = 1;
        for(int i = 1; i<arr.length; i++)
        {
            if(Math.abs(arr[i] - arr[i-1]) >1)
            arr[i] = 1 + arr[i-1];
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
