// Mode of Binary Tree.. Can Contain Duplicates..
class Solution {
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> map = new HashMap<>();
        int n=0;
        int max=-1;
        traverse(root,map);
        for(int p: map.values()){
            max = Math.max(max,p);
        }
        for(int p:map.keySet()){
            if(map.get(p)==max){
                n++;
            }
        }
        int[] res = new int[n];
        int i=0;
        for(int p: map.keySet()){
            if(map.get(p)==max){
                res[i++]=p;
            }
        }
        return res;
    }
    public void traverse(TreeNode root, Map<Integer,Integer> map){
        if(root==null) return;
        traverse(root.left,map);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        traverse(root.right,map);
    }
}