// Largest Area in Histogram
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxArea=0;
        int n = heights.length;
        for(int i =0;i<n;i++){
            while(st.peek()!=-1 &&(heights[st.peek()] >= heights[i])){
                int currentHeight = heights[st.pop()];
                int currentWidth = i - st.peek() - 1;
                maxArea = Math.max(maxArea, currentHeight * currentWidth);
            }
            st.push(i);
        }
        while (st.peek()!=-1) {
            int currentHeight = heights[st.pop()];
            int currentWidth = n - st.peek() - 1;
            maxArea = Math.max(maxArea, currentHeight * currentWidth);
        }
        return maxArea;
    }
}