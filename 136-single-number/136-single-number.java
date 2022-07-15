class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        int num =0;
        for(int i =0;i<nums.length;i++)
        {
            num = num ^ nums[i];
        }
        return num;
    }
}