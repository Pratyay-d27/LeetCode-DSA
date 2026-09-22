// Here HashMap increases time complexity as the input constraints are small so
class Solution {
    public int countSpecialIntegers(int[] nums) {
        int check[] = new int[101];
        int n = nums.length;
        
        //base case 
        if(nums.length == 1)
        return 1;

        check[nums[0]] = 1;
        for(int i = 1; i<n; i++)
        {
            int ele = nums[i];

            if( check[ele] == 0 )
            check[ele] = 1;
            else 
            {
                if(ele != nums[i-1])
                check[ele] = -1;
            }
        }
        int count = 0;
        for(int ele: check)
        if(ele == 1)
        count += 1;

        return count;
    }
}
// 1 2 2 1 5 1
