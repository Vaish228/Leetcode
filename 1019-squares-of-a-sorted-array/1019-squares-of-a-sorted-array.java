class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            res[j++]=Math.abs(nums[i]*nums[i]);
        }
        Arrays.sort(res);
        return res;
    }
}