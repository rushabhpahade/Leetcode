//Number of Subarrays with bounded maximum
class Solution {
// Use Sliding Window Techinque. Kepp Count of arrays and Previous count
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int n=nums.length;
        int j=0;
        int ans=0;
        int prevcount=0;
        for(int i=0;i<n;i++){
        if(nums[i]>=left && nums[i]<=right)
        {
            ans += i-j+1;
            prevcount = i-j+1;
        }
        else if(nums[i]<left){
                ans+=prevcount;
        }else{
            j=i+1;
            prevcount=0;
        } // nums[i]>right          
        }
        return ans;
    }
}