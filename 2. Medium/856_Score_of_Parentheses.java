// Using stack approac

class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int score = 0;
        for(int i = 0; i<s.length(); i++)
        {
            char ele = s.charAt(i);
            if(ele == '(')
            {
                stack.push(score);
                score = 0;
            }
            else 
            {
                if(s.charAt(i-1) == '(')
                score = stack.peek()+1;
                else 
                {
                    score = stack.peek() + (2*score);
                }
                stack.pop();
            }
        }
        return score;
    }
}
