// Brute
class Solution {
    public long countCommas(long n) {
        if(n <= 999)
        return 0;
        
        long count = 0;
        long lower = 1000;
        long comma = 1;
        while(lower <= n)
        {
            long upper = lower*1000 - 1;
            if(upper >= n)
            upper = n;

            long nos = upper - lower + 1;
            count += nos*comma;

            lower *= 1000;
            comma += 1;
        }
        return count;
    }
}


