// Dynamic programming solution-approach   

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

    //recursive function 
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

-------------------------------------------------------------------------------------------------------------------------------------------------
    
//Another Approach 

class Solution {
    int dp[][] = new int[1005][1005];
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a,b)->Integer.compare(a.length(), b.length()));
        return solve(0, -1, words);  
    } 

    int solve(int i, int prev, String [] words)
    {
        if(i >= words.length)
        return 0;

        if(prev != -1 && dp[i][prev] != 0)
        return dp[i][prev];

        //take and skip logic
        int take = 0, skip = 0;
        //take
        if(prev == -1 || check(i, prev, words))
        take = solve(i+1, i, words) + 1;
        //skip
        skip = solve(i+1, prev, words);

        if(prev != -1)
        return dp[i][prev] = Math.max(take, skip);
        return Math.max(take, skip);
    }

    boolean check(int k, int prev, String words[])
    {
        String b = words[k];
        String a = words[prev];
        //base case - length check
        if(b.length() - a.length() != 1)
        return false;

        boolean power = false;
        int i = 0, j = 0;
        while(j<b.length() && i<a.length())
        {
            if(a.charAt(i) != b.charAt(j))
            {
                if(power == false)
                {
                    power = true;
                    j++;
                    continue;
                }
                else 
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
