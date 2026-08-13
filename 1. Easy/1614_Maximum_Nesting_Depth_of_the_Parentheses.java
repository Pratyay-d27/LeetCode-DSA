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
