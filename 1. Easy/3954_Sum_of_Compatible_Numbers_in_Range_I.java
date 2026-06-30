class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum = 0; //variable for storing the final sum
        for(int i = 1; i<= (n+k); i++)
        {
            if(Math.abs(i-n) <= k && ((i & n) == 0))
            sum += i;
        }
        return sum;
    }
}
