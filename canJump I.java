// Can Jump I..
/*Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.*/
class Solution {
    public boolean canJump(int[] nums) {
     int reach =0;
      
      for(int index =0;index<nums.length;index++){
          if(reach<index)
          return false;

          reach = Math.max(reach,index+nums[index]);
      }

      return true;
    }
}