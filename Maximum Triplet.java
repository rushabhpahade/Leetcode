// Find maximum Triplet value in array for i<j<k;
class Solution {
    public long maximumTripletValue(int[] nums) {
        
        long result=0; int maxa=0; int maxab=0;
        for(int i: nums){
            result = Math.max(result,1L*maxab*i);
            maxab = Math.max(maxab,maxa-i);
            maxa = Math.max(maxa,i);
        }
        return result;
        
    }
}