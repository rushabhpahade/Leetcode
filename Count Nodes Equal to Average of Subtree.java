// Count Nodes Equal to Average of Subtree
class Solution {
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
        countof(root);
        return count;
    }
    public int[] countof(TreeNode root){
        if(root==null) return new int[] {0,0};

        int[] leftCount = countof(root.left);
        int[] rightCount = countof(root.right);
        int totalNodes = leftCount[1] + rightCount[1] + 1;
        int subtreeSum = leftCount[0] + rightCount[0] + root.val;

        if (subtreeSum/totalNodes == root.val) {
            count++;
        }
        return new int[]{subtreeSum,totalNodes};
    }
}