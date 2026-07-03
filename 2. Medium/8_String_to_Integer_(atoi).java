class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        
        if(s.length() == 0)
        return 0;

        String str = "";
        
        //determine sign. true - positive, false - negative
        boolean sign = (s.charAt(0) == '-')?false:true;
        if(s.charAt(0) != '-' && s.charAt(0) != '+')
        s = '+' + s;

        //processing character by character
        for(int i = 1; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if("0123456789".indexOf(ch) == -1)
            break;
            if(ch != ' ')
            str += ch;
        }
        //convert to int
        //for minus
        int ans = 0;
        if(sign == false && str.length()>0)
        {
            try
            {
                ans = -1 * Integer.valueOf(str);
            }
            catch(Exception e)
            {
                ans = (-1 * (int)Math.pow(2, 31)) - 1;
            }
        }
        else if(sign == true && str.length()>0) 
        {
            try
            {
                ans = Integer.valueOf(str);
            }
            catch(Exception e)
            {
                ans = (int)Math.pow(2, 31);
            }
        }
        return ans;
    }
}
