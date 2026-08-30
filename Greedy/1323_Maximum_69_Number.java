// Solution without converting to String 
class Solution { 
    public int maximum69Number (int num) {
        if(num == 9 || num == 99 || num == 999 || num == 9999)
        return num;

        ArrayList<Integer> list = new ArrayList<>();
        while(num > 0)
        {
            list.add(num % 10);
            num /= 10;
        }
        int i = 0;
        for(i = list.size()-1; i>=0; i--)
        {
            if(list.get(i) == 6)
            break;
        }
        list.set(i, 9);
        int ans = 0;
        for(int j = list.size()-1; j>=0; j--)
        {
            ans = ans * 10 + list.get(j);
        }
        return ans;
    }
}
