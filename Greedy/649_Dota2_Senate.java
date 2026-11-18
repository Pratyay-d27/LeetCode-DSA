class Solution {
    public String predictPartyVictory(String senate) {
        ArrayList<Character> list = new ArrayList<>();
        //count of radiant and dire 
        int radiant = 0, dire = 0;
        for(char ch: senate.toCharArray())
        {
            if(ch == 'R')
            radiant++;
            else 
            dire++;
            list.add(ch);
        }      

        int i = 0;
        while(radiant > 0 && dire > 0)
        {
            char ele = list.get(i);
            int n = list.size();
            int index = Integer.MAX_VALUE;
            if(ele == 'R')
            {
                index = find('D', list, (i+1)%n);//sending next index to search from
                list.remove(index);
                dire--;
            }
            else 
            {
                index = find('R', list, (i+1)%n);//sending next index to search from
                list.remove(index);
                radiant--;
            }
            if(index < i)
            i--;
            
            n = list.size();
            i = (i+1) % n;
        }
        return radiant > 0 ? "Radiant":"Dire";
    }
    
    int find(char ch, ArrayList<Character> list, int i)
    {
        //i = next index to search from
        while(true)
        {
            char ele = list.get(i);
            if(ele == ch)
            break;

            i = (i+1) % list.size();
        }
        return i; // element not found
    }
}
