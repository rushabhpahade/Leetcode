class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> helper = new ArrayList<>();
        findans(0,target,candidates,ans,helper);
        return ans;
    }
    private void findans(int index, int target, int[] candidates,List<List<Integer>> ans,List<Integer> helper){
        if(target == 0){
            ans.add(new ArrayList<>(helper));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]){
                //Skip Similar Elements
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            helper.add(candidates[i]);
            findans(i+1,target-candidates[i],candidates,ans,helper);
            helper.remove(helper.size()-1);
        }
    }
}