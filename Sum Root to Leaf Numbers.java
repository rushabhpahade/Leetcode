//Sum Root to Leaf Numbers
class Solution {
    public int sumNumbers(TreeNode root) {
        int ans = solve(root,0);
        return ans;
    }
    public int solve(TreeNode root,int tempSum){
        if(root==null) return 0;
        tempSum = tempSum*10 + root.val;
        if(root.left==null && root.right ==null){
            return tempSum;
        }
        return solve(root.left,tempSum) + solve(root.right,tempSum);    
    }
}
// A little slow code
class Solution {
    public int sumNumbers(TreeNode root) {
        String s ="";  int ans=0;   List<Integer> list = new ArrayList<>();
        solve(root,list,s);
        for(int num:list)
            ans+=num;
        return ans;
    }
    public void solve(TreeNode root,List<Integer> list , String s){
        if(root.left == null && root.right ==null){
            s+=root.val;
            list.add(Integer.parseInt(s));
            return;
        } 
        s+=root.val;
        if(root.left!=null)
            solve(root.left,list,s);
        if(root.right!=null)
            solve(root.right,list,s);
 }
}