//Majority Element
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int val=nums[0];
        int count=1;

        for(int i=1;i<n;i++)
        {
            if(count==0)
            {
                val=nums[i];
                count++;
            }
            else if(val==nums[i])
            {
                count++;
            }
            else
            count--;
        }
        return val;
    }
}

-------------------------------------------------------------------------
#Python
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        val=nums[0]
        count=1
        for i in range(1,len(nums)):
            if(count==0):
                val=nums[i]
                count+=1
            elif(nums[i]==val):
                count+=1
            else:
                count-=1
        return val            

        