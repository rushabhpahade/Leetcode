// 3 Sum which equals to Zero
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int target=0;
        List<List<Integer>> finalList = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
             if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j=i+1,k=nums.length-1;
            List<Integer> list = new ArrayList<>();
            while(j<k){
                int sum = nums[i] + nums[j]  + nums[k];
                if(sum==0){
                    finalList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    // Skip duplicate elements for k
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    // Move the pointers
                    j++;
                    k--;
                }
                else if (sum<0){
                    j++;
                }
                else
                k--;
            }
        }
        return finalList;
    }
}