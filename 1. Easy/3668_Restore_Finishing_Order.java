class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = order.length;
        int freq[] = new int[101];
        for(int ele: friends)
        {
            freq[ele]++;
        }
        int index = 0;
        for(int ele: order)
        {
            if(freq[ele] == 1)
            {
                friends[index++] = ele;
            }
        }
        return friends;
    }
}
