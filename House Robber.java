// Adjacent House Robber
class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if(nums.length<2) return nums[0]; 
        dp[0]=nums[0];
        dp[1]=Math.max(nums[1],dp[0]);
        for(int k=2;k<nums.length;k++){
            dp[k] = Math.max(dp[k-2]+nums[k],dp[k-1]);
        }
        return dp[nums.length-1];
    }
}