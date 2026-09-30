// Optimal solution 

class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int result[] = new int[n];
        int d = 0;
        for(int i = 0; i<n; i++)
        {
            // for '(' bracket 
            if(seq.charAt(i) == '(')
            {
                d++;
                result[i] = (d%2 == 0)?0:1;
            }
            else 
            {
                result[i] = (d%2 == 0)?0:1;
                d--;
            }
        }
        return result;
    }
}
