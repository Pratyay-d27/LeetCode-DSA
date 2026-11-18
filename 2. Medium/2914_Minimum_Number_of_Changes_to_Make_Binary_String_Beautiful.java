class Solution {
    public int minChanges(String s) {
        int i = 0, j = 1;
        int count = 0;
        while(j < s.length())
        {
            if(s.charAt(i) != s.charAt(j))
            count++;

            i += 2;
            j += 2;
        }
        return count;
    }
}
