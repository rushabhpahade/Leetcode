//1727. Largest Submatrix With Rearrangements
class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int maxArea = 0;

        for (int i = 1; i < n; i++) {
            for(int j=0;j<m;j++){
                if(matrix[i][j]==1){
                    matrix[i][j]= matrix[i-1][j]+1;
                }
            }
        }    
        for(int i=0;i<n;i++)
        {
            Arrays.sort(matrix[i]);
            for(int j=0;j<m;j++){
                maxArea = Math.max(maxArea,(j+1)*matrix[i][m-j-1]);
            }
        }
        return maxArea;
    }
     
}