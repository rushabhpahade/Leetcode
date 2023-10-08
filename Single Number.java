// Solved using XOR
/*
XOR of zero and some bit returns that bit
a^0 = a
XOR of two same bits returns 0
a^a = 0
XOR of a^b^a for some bits a and b returns b
a^b^a = (a^a)^b = 0^b = b
*/
class Solution {
    public int singleNumber(int[] nums) {
        int ans =0;

        for(int i=0;i<nums.length;i++){
            ans = ans^nums[i];
        }
        return ans;
    }
}