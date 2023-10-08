//# Dont do square of each and then again sort. Take 2 pointer approach..
// Squares of Sorted Array
class Solution {
    public int[] sortedSquares(int[] nums) {
            int [] ans = new int[nums.length];
            int i =0;
            int j= nums.length-1;

            for(int k = nums.length-1;k>=0;k--)
            {
                int num1 = nums[i]*nums[i];
                int num2 = nums[j]*nums[j];
                if(num1>num2){
                    ans[k]=num1;
                    i++;
                }
                else{
                    ans[k]=num2;
                    j--;
                }
            }
          return ans;
    }
}