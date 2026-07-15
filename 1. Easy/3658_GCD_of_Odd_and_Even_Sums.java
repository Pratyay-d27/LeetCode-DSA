class Solution {
    public int gcdOfOddEvenSums(int n) {
        //sum of first n odd natural numbers = n sqaure
        //sum of first n natural even numbers = n(n+1)
        int odd = (int) Math.pow(n, 2);
        int even = n * (n+1);
        int gcd = 1;
        for(int i = 1; i<=Math.min(odd, even); i++)
        {
            if(odd % i == 0 && even % i == 0)
            gcd = Math.max(gcd, i);
        }
        return gcd;
    }
}
