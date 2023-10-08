// Subarray Sums Equals k
// Use HashMap to store number of subarrays starting from index zero having particular value of sum
class Solution {
    public int subarraySum(int[] nums, int k) {
            
            HashMap<Integer,Integer> map = new HashMap<>();
            int ans=0;
            int currsum=0;
            map.put(0,1);
            for(int i=0;i<nums.length;i++){
                currsum+=nums[i];
                if(map.containsKey(currsum-k))
                ans +=map.get(currsum-k);
                int t = map.getOrDefault(currsum,0)+1;
                map.put(currsum,t);
            }
            return ans;
    }
}