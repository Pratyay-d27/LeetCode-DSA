/*
LeetCode Link: https://leetcode.com/problems/boats-to-save-people/
*/

class Solution { 
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people); //sort array
        int count = 0;
        int i = 0, j = people.length-1;
        while(i<=j)
        {
            if(people[i]<=limit && people[j]<=limit)
            {
                if(people[i]+people[j] <= limit)
                {
                    count++;
                    i++;
                    j--;
                    continue;
                }
            }
            count++;
            j--;
        }
        return count;
    }
}

//1 2 2 3
