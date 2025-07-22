import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for(int digit : digits){
            sb.append(digit);
        }

        BigInteger n = new BigInteger(sb.toString()).add(BigInteger.ONE);
        String numStr = n.toString();
        int[] result = new int[numStr.length()];
        for(int i = 0; i < numStr.length(); i++) {
            result[i] = numStr.charAt(i) - '0';
        }
        return result;
    }
}
