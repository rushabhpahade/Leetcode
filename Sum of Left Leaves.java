// Sum of Left Leaves..
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
        return 0;
        int sum=0;
        sum = inorder(root,sum,false);
        return sum;
    }
    public int inorder(TreeNode root, int sum, boolean isleft){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right == null && isleft)
        return root.val; 
        return inorder(root.left,sum,true)
        + inorder(root.right,sum,false);
    }
}