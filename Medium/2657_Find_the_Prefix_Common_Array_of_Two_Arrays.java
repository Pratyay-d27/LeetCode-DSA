/*
LeetCode Link: https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/?envType=daily-question&envId=2026-05-20
*/

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int arr[] = new int[A.length];
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listb = new ArrayList<>();

        for(int i = 0; i<A.length; i++)
        {
            lista.add(A[i]);
            listb.add(B[i]);
            int count = numbers(lista, listb);
            arr[i] = count;
        }
        return arr;
    }
    static int numbers(ArrayList<Integer> lista, ArrayList<Integer> listb)
    {
        int count = 0;
        for(int i = 0; i<lista.size(); i++)
        {
            if(listb.contains(lista.get(i)))
            count++;
        }
        return count;
    }
}
