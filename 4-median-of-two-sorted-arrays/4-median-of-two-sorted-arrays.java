class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
           int m = nums1.length, n = nums2.length;
        
        if (m > n) {
            int[] temp = nums1; nums1 = nums2; nums2 = temp;
            int tmp = m; m = n; n = tmp;
        }
        
        int i_min = 0, i_max = m, half_len = (m + n + 1) / 2;
           
        while (i_min <= i_max) {
            int i = (i_min + i_max) / 2, j = half_len - i;
            
            if(i < i_max && nums1[i] < nums2[j - 1]) {
                i_min = i + 1;
            }
            else if(i > i_min && nums2[j] < nums1[i - 1]) {
                i_max = i - 1;
            }
            else {
                int maxleft = 0;
                
                if (i == 0) {
                    maxleft = nums2[j - 1];
                }
                else if (j == 0) {
                    maxleft = nums1[i - 1];
                }
                else {
                    maxleft = Math.max(nums1[i - 1], nums2[j - 1]);
                }
                
                if ((m + n) % 2 == 1) {
                    return maxleft;
                }
                
                int minright = 0;
                
                if (i == m) {
                    minright = nums2[j];
                }
                else if (j == n) {
                    minright = nums1[i];
                }
                else {
                    minright = Math.min(nums1[i], nums2[j]);
                }
                return (maxleft + minright) / 2.0;
            }
        }
        return 0.0;
    }
}