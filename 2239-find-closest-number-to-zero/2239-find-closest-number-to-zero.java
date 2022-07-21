class Solution {
    public int findClosestNumber(int[] nums) {
        int cnt = 0;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++)
        {
             if(Math.abs(nums[i])<min)
             {
                 min = Math.abs(nums[i]);
                 cnt = nums[i];
             }
             else if(Math.abs(nums[i])==min && nums[i]>cnt)
             {
                cnt = nums[i];
             }
        }
        return cnt;
    }
}