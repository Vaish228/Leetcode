import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++; 
                return digits;
            }      
            digits[i]=0;
        }

        int[] re = new int[n+1];
        re[0]=1;
        return re;
    }
}
