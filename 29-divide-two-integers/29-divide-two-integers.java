class Solution {
    public int divide(int dividend, int divisor) {
        if (Integer.MIN_VALUE == dividend && divisor == -1)
            return Integer.MAX_VALUE;
        int ans = 0;
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        while (a - b >= 0) {
            int t = b;
            int cnt = 1;
            while (a - (t << 1) >= 0) 
            {
                t  <<= 1;
                cnt <<= 1;
            }
            a =a-t;
            ans =ans - cnt;
        }
        if((dividend > 0) == (divisor > 0))
        {
            return -ans;
        }
        else
        {
            return ans;
        }
    }
}