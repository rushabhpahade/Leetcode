// remove duplicates such that maximum only 2 duplicates are allowed. Return the last position till where array is modified. Do not use different Array
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<=2){
            return n;
        }
        int i=2;
        for(int j=2;j<n;j++){
            if(nums[i-2]!=nums[j]){
                    nums[i]=nums[j];
                    i++;
            }
        }
        return i;
    }
}