//Maximum Subarray Product..
class Solution {
    public long maxProduct(int[] nums) {
        int n = nums.length;
        long pref1 = 1L; // Initialize as long
        long max1 = Integer.MIN_VALUE; // Initialize as long
        long pref2 = 1L; // Initialize as long
        long max2 = Integer.MIN_VALUE; // Initialize as long
        for (int i = 0; i < n; i++) {
            if (pref1 == 0) {
                pref1 = 1L; // Reset pref1 when encountering a zero
            }
            pref1 = pref1 * nums[i];
            max1 = Math.max(max1, pref1);
        }
        for (int i = n - 1; i >= 0; i--) {
            if (pref2 == 0) {
                pref2 = 1L; // Reset pref2 when encountering a zero
            }
            pref2 = pref2 * nums[i];
            max2 = Math.max(max2, pref2);
        }
        // Cast long to int
        return  Math.max(max1, max2);
    }
    public static void main(String[] args) {
        int[] nums = {10, 10, 10, 10, 10, 10, 0, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 0};
        Solution solution = new Solution();
        long result = solution.maxProduct(nums);
        System.out.println("Maximum Product: " + result);
    }
}
