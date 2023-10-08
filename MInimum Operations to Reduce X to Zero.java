// Calculate target and find subarray which equls target sum.
//Minimum Operations to Reduce X to Zero
class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int target = 0;
    for(int i=0;i<n;i++)
    {
        target += nums[i];
    }
    target = target - x;
    if(target ==0)
    return n;
    int max_sum=0,curr_sum=0,left=0;
    for(int i=0;i<n;i++)
    {
        curr_sum += nums[i];
        while(left<=i && curr_sum>target){
            curr_sum = curr_sum - nums[left];
            left++;
        }
        if(curr_sum == target)
            max_sum = Math.max(max_sum , i-left+1);
    }
    return max_sum!=0?n-max_sum:-1;
    }
}