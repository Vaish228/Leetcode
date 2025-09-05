class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int leftsum = 0;
        int rightsum = 0;
        int n = cardPoints.length;

        for(int i = 0; i < k; i++){
            leftsum += cardPoints[i];
        }

        sum = leftsum; 
        int ind = k - 1;

        for(int i = n - 1; i >= n - k; i--){
            leftsum -= cardPoints[ind--]; 
            rightsum += cardPoints[i];   
            sum = Math.max(sum, leftsum + rightsum);
        }

        return sum;
    }
}