class Solution {
    Integer[] memo;
    public int maxSumAfterPartitioning(int[] arr, int k) {
        if (arr == null || arr.length == 0) return 0;

        int n = arr.length;
        memo = new Integer[n];
        return dfs(arr, k, 0);
    }
    
    private int dfs(int[] arr, int k, int index) {
        if (index >= arr.length) 
            return 0;
        if (memo[index] != null) 
            return memo[index];
        
        int local = Integer.MIN_VALUE, max = Integer.MIN_VALUE;
        for (int i = index; i < arr.length && i < index + k; i++) {
            local = Math.max(local, arr[i]);
            max = Math.max(max, local * (i - index + 1) + dfs(arr, k, i + 1));
        }
        memo[index] = max;
        return max;
    }
}