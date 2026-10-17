class Solution {

    int sum(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }


    public int minSwaps(int[] nums) {
        int swaps = 0, n = nums.length;
        
        Integer arr[] = new Integer[n];
        int i = 0;
        for(int ele: nums)
        arr[i++] = ele;

        Arrays.sort(arr, (a,b) -> {
            int suma = sum(a);
            int sumb = sum(b);
            if(suma == sumb)
            return Integer.compare(a, b);
            else 
            return Integer.compare(suma, sumb);
        });
        //map in index
        HashMap<Integer, Integer> map = new HashMap<>();
        for(i = 0; i<n; i++)
        {
            map.put(nums[i], i);
        }

        //now count
        int count = 0;
        for(i = 0; i<n; i++)
        {
            int expected = arr[i];
            int actual = nums[i];
            if(expected != actual)
            {
                int oldi = i;
                int newi = map.get(expected);
                int temp = nums[newi];
                nums[newi] = nums[oldi];
                nums[oldi] = temp;

                map.put(expected, oldi);
                map.put(actual, newi);    

                count++;
            }
        }
        return count;
    }
}
