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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode ptr = head;
        while(ptr != null)
        {
            list.add(ptr.val);
            ptr = ptr.next;
        }

        ArrayList<Integer> points = new ArrayList<>();
        for(int i = 1; i<list.size()-1; i++)
        {
            if(list.get(i) > list.get(i-1) && list.get(i) > list.get(i+1))
            points.add(i);
            if(list.get(i) < list.get(i-1) && list.get(i) < list.get(i+1))
            points.add(i);
        }

        if(points.size() <= 1)
        return new int [] {-1, -1};

        Collections.sort(points);
        System.out.println(points);
        int max = points.get(points.size()-1) - points.get(0);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i<points.size(); i++)
            min = Math.min(min, points.get(i) - points.get(i-1));

        return new int[] {min, max};
    }
}
