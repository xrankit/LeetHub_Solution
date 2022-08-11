import java.lang.*;
class Solution {
    public int maxSubArray(int[] nums) {
      int maxSum = nums[0];
      int Currsum = 0;
      int minSum = 0;
      for (int num : nums) {
 
        Currsum += num;
       
        maxSum = Math.max(maxSum, Currsum - minSum);
       
        minSum = Math.min(minSum, Currsum);
      }
      return maxSum;
    }
}