/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int n = 0;
        ListNode ptr = head;
        while(ptr != null)
        {
            n++;
            ptr = ptr.next;
        }
        //base case when nodes = 1;
        if(n == 1)
        return null;
        
        //rest of the code 
        int mid = n/2;
        ptr = head;
        int i = 0;
        while(i<mid-1)
        {
            ptr = ptr.next;
            i++;
        }
        ListNode node = (ptr.next).next;
        ptr.next = node;
        return head;
    }
}
