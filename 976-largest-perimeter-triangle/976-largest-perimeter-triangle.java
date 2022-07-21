class Solution {
    public int largestPerimeter(int[] nums) {
        if(nums.length<=2)
        {
            return 0;
        }
        int sum = 0;
        Arrays.sort(nums);
        for(int i = nums.length-1;i>=2;i--)
        {
             if((nums[i-2]+nums[i-1])>nums[i])
            {
               sum = nums[i-2]+nums[i-1]+nums[i];
               break;
            }
            else
            {
                sum=0;
            }
        }

        return sum;
        
    }
}