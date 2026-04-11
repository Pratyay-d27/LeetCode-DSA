/*
LeetCode Link: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
*/
class Solution {
    public String removeDuplicates(String s) {
        //base case
        if(s.length() == 1)
        return s;
        //rest of the code 
        char ch[] = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for(char ele: ch)
        list.add(ele);

        int i = 1;
        while(i<list.size())
        {
            if(list.get(i) == list.get(i-1))
            {
                list.remove(i);
                list.remove(i-1);
                i = 1;
            }
            else 
            i++;
        }
        String str = "";
        for(char ele: list)
        str += ele;
        return str;
    }
}
