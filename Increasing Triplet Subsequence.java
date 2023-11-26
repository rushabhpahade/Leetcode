//Increasing Triplet Subsequence
class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3) return false;
        int min1 = Integer.MAX_VALUE;  // First minimum value
        int min2 = Integer.MAX_VALUE;  // Second minimum value

        for (int num : nums) {
            if (num <= min1) {
                min1 = num;  // Update the first minimum value
            } else if (num <= min2) {
                min2 = num;  // Update the second minimum value
            } else {
                // We found a value greater than both min1 and min2, so it's an increasing triplet
            return true;
            }
        }
        return false;
    }
}