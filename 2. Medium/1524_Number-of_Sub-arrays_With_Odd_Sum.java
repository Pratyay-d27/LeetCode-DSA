class Solution {
    int M = 1000000007;
    public int numOfSubarrays(int[] arr) {

        //base case 
        if(arr.length == 1)
        {
            if(arr[0] % 2 == 1)
            return 1;
            else 
            return 0;
        }

        int odd = 0, even = 1;
        for(int i = 1; i<arr.length; i++)
        arr[i] += arr[i-1];

        int total = 0;
        for(int ele: arr)
        {
            if(ele % 2 == 0)
            {
                even++;
                if(odd > 0)
                {
                    total += odd;
                    total = total % M;
                }
            }
            else 
            {
                odd++;
                total += even;
                total = total % M;
            }
        }
        return total;
    }
}
