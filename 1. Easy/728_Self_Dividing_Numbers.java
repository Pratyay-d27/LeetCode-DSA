class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = left; i<= right; i++)
        {
            if(String.valueOf(i).indexOf('0') != -1)
            continue;
            if(check(i))
            list.add(i);
        }
        return list;
    }
    boolean check(int n)
    {
        int key = n;
        while(n > 0)
        {
            int d = n%10;
            if(key % d != 0)
            return false;
            n = n/10;
        }
        return true;
    }
}
