class Solution {
    public int brokenCalc(int startValue, int target) {
        return solve(startValue, target);
    }
    int solve(int start, int target)
    {
        int count;
        if(start == target)
        return 0;
        if(satart > target)
        count = start-target;
        else if(target % 2 == 0)
        count = solve(start, target/2) + 1;
        else 
        count = solve(start, target+1) + 1;

        return count;
    }
}
