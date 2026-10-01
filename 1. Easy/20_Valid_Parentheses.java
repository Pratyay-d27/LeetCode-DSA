class Solution {
    public boolean isValid(String s) {
        //base case
        if(s.length() == 1)
        return false;

        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray())
        {
            if(ch == '(' || ch == '{' || ch == '[')
            {
                stack.push(ch);
            }
            else
            {
                if(stack.size() == 0)
                return false;
                
                char ele = stack.peek();
                if( (ele == '(' && ch == ')') || (ele == '[' && ch == ']') || (ele == '{' && ch == '}') )
                stack.pop();
                else 
                return false;
            }
        }
        if(stack.size() == 0)
        return true;
        return false;
    }
}
