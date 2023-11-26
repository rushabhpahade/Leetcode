// Maximal Rectangle using histogram
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m=  matrix[0].length;
        int[] cRow = new int[m];
        int max =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1'){
                    cRow[j]++;
                }
                else cRow[j]=0;
            }
            int currMax = histogramhelper(cRow);
            max = Math.max(currMax,max);
        }
        return max;
    }

    public int histogramhelper(int[] cRow){
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxArea=0;
        for(int i=0;i<cRow.length;i++){
            while(st.peek()!=-1&&(cRow[st.peek()]>=cRow[i])){
                int currHeight = cRow[st.pop()];
                int currWidth = i - st.peek() -1;
                maxArea = Math.max(maxArea,currHeight*currWidth);
            }
            st.push(i);
        }
        while(st.peek()!=-1){
            int currHeight = cRow[st.pop()];
            int width = cRow.length - st.peek() -1;
            maxArea = Math.max(maxArea, currHeight*width);
        }
        return maxArea;
    }
}