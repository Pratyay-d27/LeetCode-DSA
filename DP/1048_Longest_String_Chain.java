class Solution {
    int t[][] = new int[1001][1001];
    public int longestStrChain(String[] words) {
        //sort array according to increasing length
        Arrays.sort(words, (s1, s2) -> {
            if (s1.length() < s2.length()) {
                return -1;
            } else if (s1.length() > s2.length()) {
                return 1;
            } else {
                return 0;
            }
        });
        return solve(words, 0, -1);
    }
    int solve(String [] words, int i, int p)
    {
        //base case 
        if(i == words.length)
        return 0;

        //early termination with memoization
        if( p != -1 && t[i][p] != 0)
        return t[i][p];

        //rest of the code 
        int take = 0, skip = 0;
        if( p == -1)
        take = 1 + solve(words, i+1, i);
        else if( p != -1 && check(words[i], words[p]) == true)
        take = 1 + solve(words, i+1, i);

        skip = solve(words, i+1, p);

        if(p == -1)
        return Math.max(take, skip);
        else 
        return t[i][p]  = Math.max(take, skip);
    }
    boolean check(String i, String p)
    {
        int k = 0;
        if(i.length() - p.length() == 1)
        {
            while(k<p.length() && i.charAt(k) == p.charAt(k))
            {
                k++;
            }
            //System.out.print(p + " "+ i + " " + (i.substring(0, k) + i.substring(k+1)).equals(p) + " ");
            return (i.substring(0, k) + i.substring(k+1)).equals(p);
        }
        return false;
    }
}
