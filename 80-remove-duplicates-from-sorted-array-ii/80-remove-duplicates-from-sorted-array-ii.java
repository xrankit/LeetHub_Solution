class Solution {
    public int removeDuplicates(int[] nums) 
    {
        if(nums.length==0 || nums==null)
        {
            return 0;
        }
        int count =1;
        int k =1;
        for(int i =1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                if(k==1)
                {
                    nums[count]=nums[i];
                    count++;
                    k++;
                }
                else if(k==2)
                {
                    continue;
                }
            }
            else
            {
                nums[count]=nums[i];
                count++;
                k=1;
            }
            
        }
        
        return count;
    }
}