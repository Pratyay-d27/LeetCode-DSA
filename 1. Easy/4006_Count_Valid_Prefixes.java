class Solution {
    public int countValidPrefixes(String s) {
        int ones = 0, zeros = 0, count = 0;
        for(char ch: s.toCharArray())
        {
            if(ch == '0')
            zeros++;
            else 
            ones++;

            if(Math.abs(zeros - ones) <= 1)
            count++;
        }
        return count;
    }
}
