class Solution {
    public int f(int i, int buy,int a[],int dp[][]){
        int profit = 0;
        if(i==dp.length) return 0;

        if(dp[i][buy]!=-1) return dp[i][buy];

        if(buy==1){
            profit = Math.max( (-a[i] + f(i+1,0,a,dp)), 0 + f(i+1,1,a,dp));
            // if we are buying or not max of that to be stored in profit 
            // if we buy we cannot sell so 0 at first and minus it from the profit if not move as it is to the next element - (-) because we are spending
        }
        else{
            profit = Math.max( (a[i] + f(i+1,1,a,dp)), 0 + f(i+1,0,a,dp));
            //sell ot not sell - if we sell then we can buy so 1 and that will be added to the profit as we get something in return 
        }

        return dp[i][buy] = profit;

    }
    public int maxProfit(int[] a) {
       int n = a.length;
       int dp[][] = new int[n][2];
        for(int row[] : dp){
            Arrays.fill(row,-1);
        }

        int max  = f(0,1,a,dp);


        return max;
    }
}