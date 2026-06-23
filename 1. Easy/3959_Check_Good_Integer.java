class Solution {
    public boolean checkGoodInteger(int n) {
        int sum = 0, square = 0;
        while(n>0)
        {
            int d = n%10;
            sum += d;
            square += (d*d);
            n = n/10;
        }
        return ((square-sum) >= 50);
    }
}
