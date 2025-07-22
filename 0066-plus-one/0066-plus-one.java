import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for(int d : digits){
            sb.append(d);
        }
        BigInteger nn = new BigInteger(sb.toString()).add(BigInteger.ONE);
        String s = nn.toString();
        int[] a = new int[s.length()];
        for(int i=0;i<s.length();i++){
            a[i] = s.charAt(i)-'0';
        }
        return a;
    }
}
