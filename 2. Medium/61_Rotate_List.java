/*
LeetCode Link: https://leetcode.com/problems/rotate-list/?envType=daily-question&envId=2026-05-05
*/

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        //count length of linked list
        int n = 0;
        ListNode ptr = head;
        while(ptr != null)
        {
            n++;
            ptr = ptr.next;
        }
        //now n = length of linked list
        //base case 
        if(n<2)
        return head;

        //rest of the code
        k = k % n;
        while( k > 0)
        {
            ListNode temp = head;
            while(temp.next.next != null)
            temp = temp.next;
            //now temp is the 2nd last node 
            
            temp.next.next = head;
            head = temp.next;
            temp.next = null;
            //decrement k
            k--;
        }
        return head;
    }
}
