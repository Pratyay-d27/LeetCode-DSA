class Solution {
    public boolean consecutiveSetBits(int n) {
        //integer to binary
        int count = 0;
        String s = "";
        while(n>0)
        {
            int d = n%2;
            if(s.length() > 0)
            {
                if(d == 1 && s.charAt(0) == '1')
                count++;
            }
            s = d + s;
            n = n/2;
        }
        return count == 1;
    }
}
