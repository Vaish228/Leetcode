class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> h = new HashMap<> ();
        for(int i=0;i<nums2.length;i++)
        {
            h.put(nums2[i],i);
        }
        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            res[i]=-1;
            for(int j=h.get(nums1[i])+1; j<nums2.length; j++)
            {
                if(nums1[i]<nums2[j])
                {
                    res[i]=nums2[j];
                    break;
                }
            }
        }
        return res;
    }
}