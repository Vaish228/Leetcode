class Solution {
    public int longestConsecutive(int[] nums) {
        // Set<Integer> s = new HashSet<>();
        // for (int num : nums) {  
        //     s.add(num);
        // }

        // int lc = 0;
        // for (int num : nums) {
        //     if (!s.contains(num - 1)) {  
        //         int current = num;
        //         int cur_count = 1;

        //         while (s.remove(current + 1)) {
        //             current++;
        //             cur_count++;
        //         }

        //         lc = Math.max(cur_count, lc);
        //     }
        // }


        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        int lc=0;
        int cc=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                if(nums[i]==nums[i-1]+1)
                     cc+=1;
                else
                {
                    lc = Math.max(lc,cc);
                    cc=1;
                }     
            }
        }
        return Math.max(lc,cc);
        }
    
} 