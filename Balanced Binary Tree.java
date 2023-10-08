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
 // Check if Binary Tree is Balanced
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(getheight(root)==-1)
        return false;
        else
        return true;
    }
    int getheight(TreeNode root){
            if(root==null){
              return 0;
            }
            int left = getheight(root.left);
            int right = getheight(root.right);
            if(left ==-1|| right==-1)return -1;
            if(Math.abs(left-right)>1)return -1;
            return 1 + Math.max(left,right);
    }
}