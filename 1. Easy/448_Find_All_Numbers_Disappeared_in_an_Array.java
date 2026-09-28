//Brute force + optimal solutio
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean freq[] = new boolean[n+1];
        for(int ele: nums)
        freq[ele] = true;

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<=n; i++)
        {
            if(freq[i] != true)
            list.add(i);
        }
        return list;
    }
}
