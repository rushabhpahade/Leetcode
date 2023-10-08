// Find Missing Positive..
class Solution {
    public int firstMissingPositive(int[] nums) {
        // Check Conditions used in while loop. Also Place the numbers where they should be and at last check which one is missing..
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]==i+1)
            {
                i++;
                continue;
            }
            if(nums[i]<=0 || nums[i]>n){
                i++;
                continue;
            }
            int index1 =i;
            int index2 = nums[i] -1;
            if(nums[index1]==nums[index2])
            {
                i++;
                continue;
            }
            int temp = nums[index1];
            nums[index1]= nums[index2];
            nums[index2] = temp;
        }
        for(int k=0;k<n;k++){
                if(nums[k]!= k+1)
                return k+1;
        }
        return n+1;
    }
}