class Solution {
    public int maxNumberOfBalloons(String text) {
        if(text.length() < 7)
        return 0;
        
        long count = 0, b = 0, a = 0, l = 0, o = 0, n = 0;
        for(char ch: text.toCharArray())
        {
            if(ch == 'b')
            b++;
            else if(ch == 'a')
            a++;
            else if(ch == 'l')
            l++;
            else if(ch == 'o')
            o++;
            else if(ch == 'n')
            n++;
        }
        
        while( ( b * a * l * o * n ) > 0 )
        {
            if(b-1>=0 && a-1>=0 && l-2>=0 && o-2>=0 && n-1>=0)
            {
                b--;
                a--;
                l-=2;
                o-=2;
                n--;
                count++;
            }
            else 
            break;
        }
        return (int)count;
    }
}
