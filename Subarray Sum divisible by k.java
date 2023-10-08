// Subarray Sum Divisible by K
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
            
            HashMap<Integer,Integer> map = new HashMap<>();
            int ans=0;
            int sum=0;
            map.put(0,1);
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                int rem = sum % k;
                if(rem<0)
                rem+= k;
                if(map.containsKey(rem))
                ans +=map.get(rem);
                int t = map.getOrDefault(rem,0)+1;
                map.put(rem,t);
            }
            return ans;
    }
}