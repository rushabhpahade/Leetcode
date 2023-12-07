// Can jump..
class Solution {
    public boolean canJump(int[] nums) {
     int index = nums.length-1;
     for(int i=index;i>=0;i--){
         if(nums[i]+i>=index){
             index=i;
         }
     }
     if(index==0) return true;
     else return false;
    }
}

// DP Approach Now..
class Solution {
    public boolean canJump(int[] nums) {
     int[] dp = new int[nums.length+1];
     dp[0] = nums[0];
     for(int i=0;i<nums.length;i++){
         if(dp[i]<i) return false;
         if(nums[i]+i>dp[i]) dp[i+1] =i+nums[i];
         else dp[i+1] = dp[i];
     }
     return true;
}
}
// One More Approach
class Solution {
    public boolean canJump(int[] nums) {
     int reach =0;
     for(int i=0;i<nums.length;i++){
         if(reach<i) return false;
         reach = Math.max(reach,nums[i]+i);
     }
     return true;
}
}