//Max SubArray
class Solution {
    public int maxSubArray(int[] nums) {
        
        int cmax=0;
        int omax= Integer.MIN_VALUE;
        for(int i=0;i<=nums.length-1;i++){
            if(cmax<0)
            {
                cmax =nums[i];
            }
            else
            {
            cmax = cmax + nums[i];
            }
            omax = Math.max(omax,cmax);
        }
        return omax;
    }
}


-----------------------------------------------------------------------------------------
Python 

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        cmax=0
        omax=-99999

        for i in range(len(nums)):
            if(cmax<0):
                cmax=nums[i]
            else:
                cmax= cmax + nums[i]
            omax = max(omax,cmax)
        return omax            