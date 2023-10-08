class Solution {
    int preIndex = 0;
    static HashMap<Integer,Integer> mp = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //TreeNode tree = new TreeNode();
        int len = preorder.length;
        for(int i = 0; i < len; i++)
        {
            mp.put(inorder[i], i);
        }
        TreeNode root = buildTree(inorder, preorder, 0, len - 1);
        return root;
    }
    TreeNode buildTree(int[] in, int[] pre, int instart, int inend){
            if (instart > inend)
            return null;
            TreeNode tNode = new TreeNode(pre[preIndex++]);
            if (instart == inend)
            return tNode;
            int inIndex = mp.get(tNode.val);
            tNode.left = buildTree(in, pre, instart,inIndex-1);
            tNode.right = buildTree(in, pre, inIndex+1, inend);

            return tNode;
    }
}