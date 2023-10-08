// Subarray Product Less Than K using Sliding Windows..
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {   
    if (k <= 1) {
        return 0; // No subarray can have a product less than or equal to 0
    }    
    int product = 1;
    int count = 0;
    int left = 0;
    
    for (int right = 0; right < nums.length; right++) {
        product *= nums[right]; 
        // Shrink the window from the left until the product is less than k
        while (product >= k) {
            product /= nums[left];
            left++;
        }
        // For each valid right, all subarrays [left, right], [left+1, right], ..., [right, right] will have a product less than k
        count += (right - left + 1);
    } 
    return count;
    }
}