class Solution {
    public int reverse(int x) {
        boolean sign = (x>0)?true:false;
        if(x<0)
        x = x*-1;

        String s = String.valueOf(x);
        ArrayList<Character> list = new ArrayList<>();
        for(char ch: s.toCharArray())
        list.add(ch);
        Collections.reverse(list);
        String str = "";
        for(char ch: list)
        str = str+ch;
        
        int ans;
        //main logic part
        try
        {
            if(sign == false)
            ans = -1 * Integer.valueOf(str);
            else 
            ans = Integer.valueOf(str);
        }
        catch(Exception e)
        {
            return 0;
        }
        return ans;
    }
}
