// Program to find first and last occurence of the target value in Sorted array which can have duplicate values. Use Binary Search Twice
class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int [] ans = new int[2];
        ans[0]=-1;ans[1]=-1;
        int n = nums.length;
        int left =0; int right =n-1;      
        while(left<=right){
            int mid = left + (right - left)/2;
            if(nums[mid]==target){
                    ans[0]= mid;
                    right = mid -1;
            }
            else if(nums[mid]< target){
                left = mid + 1;
            }
            else    right = mid - 1;
        }
        left =0; right =n-1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(nums[mid]==target){
                    ans[1]= mid;
                    left = mid + 1;
            }
            else if(nums[mid]< target){
                left = mid + 1;
            }
            else    right = mid - 1;
        }
        return ans;
    }
}