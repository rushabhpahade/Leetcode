// Level order Traversal Using queue
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<>();
        Queue<TreeNode> list = new LinkedList<>();
        if(root==null)
        return finalList;

        list.offer(root);
        while(!list.isEmpty()){
            int size = list.size();
            List<Integer> tmp = new ArrayList<>();
            int i=0;
            while(i<size){
                TreeNode node = list.poll();
                tmp.add(node.val);
                if(node.left!=null)
                    list.add(node.left);
                if(node.right!=null)
                    list.add(node.right);
                i++;        
            }
            finalList.add(tmp);
        } 
        return finalList;
    }   
}