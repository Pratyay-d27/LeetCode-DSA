class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum = 0;
        for(int i = 1; i<= (n+k); i++)
        {
            if(Math.abs(i-n) <= k && ((i & n) == 0))
            sum += i;
        }
        return sum;
    }
}
