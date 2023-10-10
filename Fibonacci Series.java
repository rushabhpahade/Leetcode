// Iterative is faster than DP
// Fibonacci Solution Usig DP and Iterative..
class Solution {
    public int fib(int n) {
        if(n<2)
        return n;
        int[] dp = new int[n+1];
        dp[0]=0;dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i] = dp[i-1]+ dp[i-2];
        }
        return dp[n];
    }
}
class Solution {
    public int fib(int n) {
        if(n==1)
        return 1;
        if(n==0)
        return 0;
        int ans = fib(n-1)+fib(n-2);

        return ans;
    }
}