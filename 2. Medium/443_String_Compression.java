class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1)
        return 1;
        String str = "";
        int i = 0, j = 1, count = 1, d = 0;
        while(j<chars.length)
        {
            if(chars[i] == chars[j])
            {
                count++;
                j++;
            }
            else if(chars[i] != chars[j])
            {
                str = str + chars[i];
                if(count > 1)
                str = str + count;
                count = 1;
                i = j;
                j++;
            }
        }
        str = str + chars[i];
        if(count > 1)
        str = str + count;
        
        for( d = 0; d<str.length(); d++)
        {
            chars[d] = str.charAt(d);
        }
        return d;
    }
}
