class Solution {
    public int addDigits(int num) {
        int s=0;
        if(num<10) return num;
        while(num!=0){
            int re =num%10;
            num/=10;
            s+=re;
        }
        return addDigits(s);
    }
}