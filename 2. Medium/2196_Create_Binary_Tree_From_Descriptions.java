/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0; i<descriptions.length; i++)
        {
            TreeNode root, child;
            if(map.containsKey(descriptions[i][0]) == false)
            {
                root = new TreeNode(descriptions[i][0]);
                map.put(descriptions[i][0], root);
            }
            else 
            root = map.get(descriptions[i][0]);

            if(map.containsKey(descriptions[i][1]) == false)
            {
                child = new TreeNode(descriptions[i][1]);
                map.put(descriptions[i][1], child);
            }
            else 
            child = map.get(descriptions[i][1]);

            if(descriptions[i][2] == 1)
            root.left = child;
            else 
            root.right = child;

            set1.add(descriptions[i][0]);//stores parents
            set2.add(descriptions[i][1]);//stores child
        }
        TreeNode ans = new TreeNode();
        for(int ele: set1)
        {
            if(set2.contains(ele) == false )
            {
                ans = map.get(ele);
                break;
            }
        }
        return ans;
    }
}
