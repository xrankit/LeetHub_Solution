class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int count=0;
        Set<Integer> s = new HashSet<>();
        Set<Integer>  intersect  = new HashSet<>();
        for(int i : nums1)
        {
            s.add(i);
        }
        for(int i : nums2)
        {
            if(s.contains(i))
            {
                intersect.add(i);
            }
            
        }
        int arr[] = new int[intersect.size()];
        int j = 0;
        for(int i: intersect)
        {
            arr[j++] = i;
        }
        return arr;
    }
}