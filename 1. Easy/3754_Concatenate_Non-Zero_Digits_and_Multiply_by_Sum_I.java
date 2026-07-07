class Solution {
    public long sumAndMultiply(int n) {
        if(n == 0)
        return 0;

        String s = "";
        for(char ch: String.valueOf(n).toCharArray())
        {
            if(ch != '0')
            s = s + ch;
        }
        long sum = 0;
        for(char ch: s.toCharArray())
        sum += (long)(ch - '0');
        
        return (long)(sum*Long.valueOf(s));
    }
}
