// int solve(int i, int* cost, int costSize){
//     if(i>=costSize)
//        return 0;
//     return cost[i] + (solve(i + 1, cost, costSize) < solve(i + 2, cost, costSize) 
//                           ? solve(i + 1, cost, costSize) 
//                           : solve(i + 2, cost, costSize));
   
// }

int solve(int i, int* cost, int costSize, int *dp)
{
    if(i>=costSize)
        return 0;
    if(dp[i]!=-1)
        return dp[i];

    int step1 = solve(i+1,cost,costSize,dp);
    int step2 = solve(i+2,cost,costSize,dp);    
    //return dp[i]=cost[i]+ (solve(i+1,cost,costSize,dp)< solve(i+2,cost,costSize,dp)) ? solve(i+1,cost,costSize,dp) :  solve(i+2,cost,costSize,dp);        
    return dp[i] = cost[i] + (step1 < step2 ? step1 : step2);
}

int minCostClimbingStairs(int* cost, int costSize) {
    int dp[costSize+1];
    memset(dp, -1, sizeof(int) * (costSize + 1));
   int step0 = solve(0, cost, costSize,dp);
    int step1 = solve(1, cost, costSize,dp);
    return step0 < step1 ? step0 : step1;
   
}
