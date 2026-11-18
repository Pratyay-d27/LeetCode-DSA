class Solution {
    public boolean winnerOfGame(String colors) {
        //base case 
        if(colors.length() <= 2)
        return false;

        int a = 0, b = 0;
        for(int i = 1; i<colors.length()-1; i++)
        {
            char ch = colors.charAt(i);
            if(ch == 'A')
            {
                if(colors.charAt(i-1) == 'A' && colors.charAt(i+1) == 'A')
                a++;
            }
            else if(ch == 'B')
            {
                if(colors.charAt(i-1) == 'B' && colors.charAt(i+1) == 'B')
                b++;
            }
        }
        if(a>b)
        return true;
        return false; 
    }
}
