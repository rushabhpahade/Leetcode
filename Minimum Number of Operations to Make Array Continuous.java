// IMP. Minimum Number of Operation required to make an array contigous..
// Sort the array. remove duplicates and then check which elements are present in the range..
class Solution {
    public int minOperations(int[] nums) { 
        Arrays.sort(nums);
        int max=0,count =0; int n = nums.length-1; int l=0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[l++] = nums[i];
        }
        for(int i=0,j=0;i<l;i++){
            while(j<l && nums[j]- nums[i]<=n){
                count++;
                j++;
            }
            max = Math.max(max,count);
            count--;
        }
        return nums.length - max;
    }
}