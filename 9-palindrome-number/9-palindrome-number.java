class Solution {
    public boolean isPalindrome(int x) {
        int num =0;
        int rem =0;
        int nums=x;
        while(x>0)
        {
            rem = x%10;
            num = 10 * num +rem;
            x=x/10;
        }
        if(num == nums)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}