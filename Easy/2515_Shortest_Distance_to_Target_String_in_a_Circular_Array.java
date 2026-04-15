/*
LeetCode Link: https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array/?envType=daily-question&envId=2026-04-15
*/
class Solution {
    public int closestTarget(String[] words, String target, int startIndex) { 
        int min = 101, n = words.length, i = startIndex, count = 0;

        //go forward
        do
        {      
            if(words[i].equals(target))
            min = Math.min(min, count);
            i = (i+1)%n;
            count++;
        }while(i != startIndex);

        //go backward
        count = 0;
        do
        {      
            if(words[i].equals(target))
            min = Math.min(min, count);
            i = (i-1+n)%n;
            count++;
        }while(i != startIndex);

        if(min == 101)
        return -1;
        return min;
    }
}
