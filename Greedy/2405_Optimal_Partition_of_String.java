class Solution {
    public int partitionString(String s) {
        if(s.length() == 1)
        return 1;

        int count = 0;
        ArrayList<Character> list = new ArrayList<>();
        list.add(s.charAt(0));
        for(int i = 1; i<s.length(); i++)
        {
            if(list.contains(s.charAt(i)))
            {
                count++;
                list.clear();
                list.add(s.charAt(i));
            }
            else 
            list.add(s.charAt(i));
        }
        return count+1;
    }
}
