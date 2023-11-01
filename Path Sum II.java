// Path SUM II || Return list containing all the paths that equal targetSum.
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        if(root==null) return list;
        checkPathSum(root,targetSum,list,curr);
        return list;
    }
    public void checkPathSum(TreeNode root, int target, List<List<Integer>> list, List<Integer> l){
        if(root==null) return;
        l.add(root.val);
        if(root.left==null && root.right==null && target - root.val ==0){
            list.add(new ArrayList<>(l));
            l.remove(l.size() - 1);
            return;
        }
        checkPathSum(root.left,target-root.val,list,l);
        checkPathSum(root.right,target-root.val,list,l);
        l.remove(l.size()-1);
        return;
    }
}