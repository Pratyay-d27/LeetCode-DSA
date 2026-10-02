class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        solve(s, 2*n, list);
        return list;
    }
    void solve(StringBuilder str, int n, List<String> list)
    {
        if(str.length() == n)
        {
            if(isValid(str))
            {
                list.add(str.toString());
            }
            return;
        }

        //backtracking code 
        //do something and explore
        str.append('(');
        solve(str, n, list);

        //undo
        str.deleteCharAt(str.length()-1);

        //do something and explore
        str.append(')');
        solve(str, n, list);

        //undo
        str.deleteCharAt(str.length()-1);
    }
    boolean isValid(StringBuilder str)
    {
        String s = str.toString();
        int count = 0;
        for(char ele: s.toCharArray())
        {
            if(ele == '(')
            count++;
            else 
            count--;

            if(count < 0)
            return false;
        }
        if(count == 0)
        return true;
        return false;
    }
}
