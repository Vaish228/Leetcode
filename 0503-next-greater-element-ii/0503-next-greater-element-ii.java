class Solution {
    public int[] nextGreaterElements(int[] nums) {
         int n = nums.length;
         int[] res = new int[n];
        // Stack<Integer> st = new Stack<>();
        // Arrays.fill(res, -1);
        // for (int i = 0; i < 2 * n; i++) {
        //     int num = nums[i % n];
        //     while (!st.isEmpty() && nums[st.peek()] < num) {
        //         res[st.pop()] = num;
        //     }
        //     if (i < n) {
        //         st.push(i);
        //     }
        // }
        // return res;

        for(int i=0;i<n;i++)
        {
            res[i]=-1;
            for(int j=1;j<n;j++)
            {
                if(nums[(i+j)%n]>nums[i])
                {
                    res[i]=nums[(i+j)%n];
                    break;
                }
            }
        }
        return res;
    }
}
