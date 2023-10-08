//Is subsequence
// Find if string s is present as contigous subsequence in it then print true else fasle
class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean ans = false;
        int n1 = s.length();
        int n2 = t.length();
        if(n1>n2)
        return false;
        if(n1==0)
        return true;
        
        int i=0,j=0;
        while(i<n1&&j<n2){
            if(t.charAt(j)==s.charAt(i)){
                  if(i==n1-1)
                  return true;
                  i++;
                  j++;  
            }
            else{
                j++;
            }
        }
        return ans;
    }
}