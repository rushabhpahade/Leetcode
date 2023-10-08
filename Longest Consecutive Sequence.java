//Longest Consecutive Sequence
// Iterating and checking if previous and next element is present in map and updating Start Point and Endpoint
class Solution {
    public int longestConsecutive(int[] nums) {
        int n1= nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int n= nums[i];
            if(map.containsKey(n)==false){
                int sp=n;
                int ep=n;
                if(map.containsKey(n-1)==true){
                     sp= sp - map.get(n-1);
                }
                if(map.containsKey(n+1)==true){
                     ep= ep + map.get(n+1);   
                }
                int len = ep-sp+1;
                map.put(sp,len);
                map.put(ep,len);
                if(sp!=n && ep!=n){
                    map.put(n,1);
                }
                ans = Math.max(ans,len);
            }
        }    
        return ans;
    }
}