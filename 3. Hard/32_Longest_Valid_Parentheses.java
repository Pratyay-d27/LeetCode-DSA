class Solution {
    public int longestValidParentheses(String s) {
        //base case 
        if(s.length() == 0)
        return 0;

        int open = 0, close = 0, result = -1;

        //front traversal
        for(char ele: s.toCharArray())
        {
            if(ele == '(')
            open++;
            else 
            close++;

            //conditions
            if(open == close && open*close != 0)
            result = Math.max(result, open+close);
            else if(close > open)
            {
                open = close = 0;
            }
        }

        //backward traversal
        open = close = 0;
        for(int i = s.length()-1; i>= 0; i--)
        {
            char ele = s.charAt(i);
            if(ele == '(')
            open++;
            else 
            close++;

            //conditions
            if(open == close && open*close != 0)
            result = Math.max(result, open+close);
            else if(open > close)
            {
                open = close = 0;
            }
        }
        return result>=0?result:0;
    }
}
