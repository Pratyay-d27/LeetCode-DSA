class Solution {
    public int reverseDegree(String s) {
        int degree = 0;
        for(int i = 0; i<s.length(); i++)
        {
            char ele = s.charAt(i);
            degree += (i+1) * (26 - (ele - 'a'));
        }
        return degree;
    }
}
