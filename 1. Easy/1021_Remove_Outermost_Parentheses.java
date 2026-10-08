// Brute force solution  
class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        String str = "";
        for(int i = 0; i<s.length(); i++)
        {
            char ele = s.charAt(i);
            if(ele == '(')
            {
                if(count != 0)
                str = str + ele;
                count++;
            }
            else 
            {
                count--;
                if(count != 0)
                str = str + ele;
            }
        }
        
        return str;
    }
}
