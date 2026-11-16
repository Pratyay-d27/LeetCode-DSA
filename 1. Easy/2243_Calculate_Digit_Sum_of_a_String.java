class Solution {
    String str;
    public String digitSum(String s, int k) {

        //base case 
        if(s.length() < k)
        return s;

        str = s;
        int c = 2;
        //do untill s.length() > k
        while(str.length() > k) // do untill that moment
        {
            String newString = "";
            for(int i = 0; i<str.length(); i += k)
            {
                String ans = "";
                if(i + k < str.length())
                ans = str.substring(i, i + k);
                else if(i+k >= str.length())
                ans = str.substring(i);
                //now the string ans is made - now perform addition on it's all digits 
                int sum = 0;
                for(char ch: ans.toCharArray())
                sum += (ch - '0');
                
                newString += String.valueOf(sum);
            }
            str = newString;
        }
        return str;
    }
}

