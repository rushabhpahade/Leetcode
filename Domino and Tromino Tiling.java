//Domino and Tromino Tiling
class Solution {
    public int numTilings(int n) {
        if(n<=2) return n;
        long [] dp = new long[n+1];
        dp[0] =1;
        dp[1] = 1;
        dp[2] = 2;
        int mod = 1000000007;
        for(int i=3;i<n+1;i++){
                dp[i] = (dp[i-1]*2 + dp[i-3])%mod;
        }
        return (int)dp[n];
    }
}