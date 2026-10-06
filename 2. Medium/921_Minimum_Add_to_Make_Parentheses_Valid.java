class Solution {
    public int minAddToMakeValid(String s) {
        int close = 0;
        Stack<Character> stack = new Stack<>();
        for(char ele: s.toCharArray())
        {
            if(ele == '(')
            stack.push(ele);
            else 
            {
                if(stack.size() > 0 && stack.peek() == '(')
                stack.pop();
                else 
                stack.push(ele);
            }
        }
        return stack.size();
    }
}
