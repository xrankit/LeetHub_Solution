class Solution {
    public int majorityElement(int[] nums) {
        int ansIndex=0;
        int count =1;
        int c = 0;
        for(int i =1;i<nums.length;i++)
        {
            if(nums[i]==nums[ansIndex])
            {
                count++;
            }
            else
            {
                count--;
            }
        
            if(count==0)
            {
                ansIndex=i;
                count = 1;
            }
        }
        
        for(int j =0;j<nums.length;j++)
        {
            if(nums[j]==nums[ansIndex])
            {
                c++;
            }
        }
        if(c > nums.length/2)
        {
            return nums[ansIndex];
        }
        
        return 0;
    }
}