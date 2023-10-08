// Maximum Average Subarray using Sliding Window for subarray of length k...
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg =0.0;
         double sum=0.0;
        int n = nums.length;
        for(int i=0;i<k;i++){ 
            sum = sum + nums[i]; 
        }
        avg = sum/k;
        for (int i = k; i < n; i++) {
        // Add the next element and subtract the first element in the current window
        sum += nums[i] - nums[i - k];
        
        // Update 'avg' if the current window's average is greater
        avg = Math.max(avg, sum / k);
    }
        return avg;
    }
}