class Solution {
    public int missingNumber(int[] nums) {
         int n = nums.length;
        // int expectedSum = n * (n + 1) / 2; 
        // int actualSum = 0;

        // for (int num : nums) {
        //     actualSum += num;
        // }

        // return expectedSum - actualSum;
 for(int i=0;i<=n;i++)
 {
    int f=1;
    for(int j=0;j<n;j++)
    {
        if(nums[j]==i)
        {
            f=0;
            break;
        }
    }
    if(f==1)
       return i;
 }
 return 0;
       

    }
}