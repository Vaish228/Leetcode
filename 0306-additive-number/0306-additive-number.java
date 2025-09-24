import java.math.BigInteger;
class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        for(int i=1;i<n;i++){
            if (num.charAt(0) == '0' && i > 1) break;
            for(int j=i+1;j<n;j++){
                if (num.charAt(i) == '0' && j > i + 1) break;
                BigInteger a = new BigInteger(num.substring(0,i));
                BigInteger b = new BigInteger(num.substring(i,j));
                if(dfs(num,j,a,b)) return true;
            }
        }
        return false;
    }

    public boolean dfs(String num, int j,BigInteger a, BigInteger b){
        if(num.length()==j) return true;
        BigInteger next = a.add(b);
        String nxt = String.valueOf(next);

        if(num.startsWith(nxt,j)){
            return dfs(num, j+nxt.length(), b, next);
        }
        else
            return false;
    }
}