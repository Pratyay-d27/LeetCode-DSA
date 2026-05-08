/*
LeetCode Link: https://leetcode.com/problems/bag-of-tokens/
*/

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0, i = 0, j = tokens.length-1, maxScore = 0;
        while(i<=j)
        {
            if(power >= tokens[i])
            {
                power -= tokens[i];
                score += 1;
                i++;
            }
            else if(score >= 1)
            {
                score -= 1;
                power += tokens[j];
                j--;
            }
            else 
            return maxScore;

            maxScore = Math.max(score, maxScore);
        }
        return maxScore;
    }
}
