class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max =0;
        for(int e : prices){
            if(min>e)
                min = e;
            else
                max = Math.max(max, e-min);    
        }
        return max;
    }
}