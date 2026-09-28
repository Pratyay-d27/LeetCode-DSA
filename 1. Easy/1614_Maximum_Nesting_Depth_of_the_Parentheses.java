//Method 1 - using deque as stack data structure  
class Solution {
    public int maxDepth(String s) {
        int max = 0;
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch: s.toCharArray())
        {
            if(ch == '(')
            stack.push(ch);
            max = Math.max(max, stack.size());
            if(ch == ')')
            stack.pop();
        }
        return max;
    }
}

//Method 2 -- with normal stack (integer) data structure 
class Solution {
    public int maxDepth(String s) {
        int max = -1;
        Stack<Integer> stack = new Stack<>();
        for(char ch: s.toCharArray())
        {
            if(ch == '(')
            stack.push(1);
            else if(ch == ')')
            stack.pop();

            max = Math.max(max, stack.size());
        }
        return max;
    }
}
