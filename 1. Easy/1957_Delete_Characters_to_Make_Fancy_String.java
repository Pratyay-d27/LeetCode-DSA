class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder(); // 
        for(int i = 0; i<s.length(); i++)
        {
            char ele = s.charAt(i);
            if(i <= 1)
            {
                ans.append(ele);
                continue;
            }

            //from i = 2 onwards
            if(ele != s.charAt(i-1) || ele != s.charAt(i-2))
            {
                ans.append(ele);
            }
        }
        return ans.toString();
    }
}
