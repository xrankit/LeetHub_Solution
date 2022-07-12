class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counter = new int[101];
    for (int i : nums) {
      counter[i]++;
    }
    int sum = 0;
    int[] restSum = new int[101];
    for (int i = 0; i < 101; i++) {
      restSum[i] = sum;
      sum += counter[i];
    }
    int[] ans = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      ans[i] = restSum[nums[i]];
    }
    return ans;
    }
}