class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0)
        {
            return 0;
        }
        int pos = 0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                pos = i;
            }
            else if(nums[i]<=target)
            {
                pos = i+1;
            }
        }
        return pos;
    }
}