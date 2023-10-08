// 132 Pattern Using Stack...
class Solution {
    public boolean find132pattern(int[] nums) {
        int min = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        int len = nums.length;
        for(int i=len-1;i>=0;i--){
                if(nums[i]<min) return true;
                while(!st.isEmpty() && st.peek()<nums[i]){
                    min = st.pop();
                }
                st.push(nums[i]);
        }
        return false;
    }
}