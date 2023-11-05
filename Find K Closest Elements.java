// Find K closest elements to x in the array. Get the array using two pointers..
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int left=0,right = arr.length-1;
        while(right-left>=k){
            if(x-arr[left]>arr[right]-x){
                left++;
            }
            else right--;
        }
        for(int i=left;i<=right;i++){
            list.add(arr[i]);
        }
        return list;
    }
}