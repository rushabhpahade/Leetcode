class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> dmap = new HashMap<>();
        HashMap<Integer,Integer> fsmap = new HashMap<>();
        int degree = 0; 
        int length = 0;   
        for(int i=0; i<nums.length; i++){
            fsmap.putIfAbsent(nums[i],i);
            dmap.put(nums[i],dmap.getOrDefault(nums[i],0)+1);
            if(dmap.get(nums[i])>degree){
                degree = dmap.get(nums[i]);
                length = i - fsmap.get(nums[i]) + 1;
            }
            else if(dmap.get(nums[i])==degree){
               length = Math.min(length,i - fsmap.get(nums[i])+1);
            }
        }
        return length;
    }
}