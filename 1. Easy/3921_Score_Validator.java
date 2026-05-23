/*
LeetCode Link: https://leetcode.com/problems/score-validator/
*/

class Solution {
    public int[] scoreValidator(String[] events) {
        int score = 0, counter = 0;
        for(String ele: events)
            {
                if("0123456".indexOf(ele) != -1)
                    score += Integer.valueOf(ele);
                else if(ele.equals("W"))
                    counter+=1;
                else if(ele.equals("WD"))
                    score += 1;
                else if(ele.equals("NB"))
                    score += 1;

                if(counter == 10)
                    break;
            }
        int arr[] = {score, counter};
        return arr;
    }
}
