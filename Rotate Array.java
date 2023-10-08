#Python Solution ->
class Solution:
  
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        k=k%n
        self.reversearr(nums,0,n-1)
        self.reversearr(nums,0,k-1)
        self.reversearr(nums,k,n-1)
    def reversearr(self,nums:List[int],s,e):
        while(s<e):
            nums[s],nums[e]=nums[e],nums[s]
            s=s+1
            e=e-1    

----------------------------------------------------------------------------------------------------------------------------
//Java Solution
// Rotate Array K Times.
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        
        k=k%n;
        reversearr(nums,0,n-1);
        reversearr(nums,0,k-1);
        reversearr(nums,k,n-1);

        }
        public void reversearr(int [] nums,int s, int e)
        {
            while(s<e)
            {
                int temp= nums[s];
                nums[s] = nums[e];
                nums[e] = temp;

                s++;
                e--;
            }
        }
}

 