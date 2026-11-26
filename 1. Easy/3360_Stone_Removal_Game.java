// Brute force approach 

class Solution {
    public boolean canAliceWin(int n) {
        //base case when alice can't even take first take 
        if(n <= 9)
        return false;

        //
        int alice = 10, bob = 9;
        int nalice = 0, nbob = 0;
        while(n != 0)
        {
            //first alice turn
            if(n < alice)
            return false;

            n = n - alice;
            alice -= 2;
            nalice++;
            
            if(n < bob)
            return true;
            
            n = n - bob;
            bob -= 2;
            nbob++;
        }
        return (nalice>nbob)?true:false;
    }
}
