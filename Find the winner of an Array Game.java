// Find the Winner in the array Game.
class Solution {
    public int getWinner(int[] arr, int k) {
        if(k>arr.length){
            return getMaximum(arr);
        }
        int count=0; int curr=arr[0];
        for(int i=1;i<arr.length;i++){
            if(curr<arr[i]){
                curr =arr[i];
                count=0;
            }
            count++;
            if(count == k){
                return curr;
            }
        }
        return curr;
    }
    public int getMaximum(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
               max = Math.max(max,arr[i]); 
        }
        return max;
    }
}