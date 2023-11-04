// PATH SUM 3. // Calculate how many paths not necessary from root and not ending at leaf which equals targetSum.
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        int count = calculate(root,targetSum,0,new ArrayList<>());
        return count;
    }
    public int calculate(TreeNode root, int targetSum, int curr_sum, ArrayList<TreeNode> list){
        if(root == null)
        return 0;
        list.add(root);
        curr_sum+= root.val;
        int cnt =0;
        long sum =0;
        for(int i= list.size()-1;i>=0;i--){
            sum+=list.get(i).val;
            if(sum==targetSum){
                cnt++;
            }
        }
        cnt+=calculate(root.left,targetSum,curr_sum,list);
        cnt+=calculate(root.right,targetSum,curr_sum,list);
        list.remove(list.size()-1);
        curr_sum -= root.val;
        return cnt;
    }
}