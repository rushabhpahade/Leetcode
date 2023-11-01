// LEVEL ORDER TRAVERSAL USING BFS// BOTTOM - UP TRAVERSAL
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)  return ans;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode node = q.remove();
                list.add(node.val);
                if(node.left!=null)
                q.add(node.left);
                if(node.right!=null)
                q.add(node.right);
            }
            ans.add(list);
        }
        Collections.reverse(ans);
        return ans;
    }
    
}