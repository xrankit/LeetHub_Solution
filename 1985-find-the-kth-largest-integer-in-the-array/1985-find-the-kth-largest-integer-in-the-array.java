class Solution {
    public String kthLargestNumber(String[] nums, int k) {
         Arrays.sort(nums,new Comparator<String>(){
            
            public int compare(String a, String b)
            {
                if(a.length()!=b.length())
                    return b.length()-a.length();
                return b.compareTo(a);
            }
        });
        return nums[k-1];
    }
}