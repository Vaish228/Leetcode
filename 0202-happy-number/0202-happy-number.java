class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        if(n==4) return false;
        int s =0;
        while(n!=0){
            int re = n%10;
            n/=10;
            s+=(re*re);
        }
        return isHappy(s);
    }
}