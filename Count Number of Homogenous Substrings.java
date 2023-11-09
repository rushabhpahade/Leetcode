// Count HomoGenous SubString in String S.( Homogenenous mean same character in the string of length 1 to n)
class Solution {
    public int countHomogenous(String s) {
        int left =0; long res=0;
        char[] c = s.toCharArray();
        for(int right=0;right<c.length;right++){
            if(c[left]== c[right]){
                res+= right-left+1;
            }
            else{
            left=right;
            res++;
            }
        }
        return (int)(res%(1000000007));
    }
}