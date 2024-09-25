class Solution {
    public boolean isSameAfterReversals(int num) {
        int r1 = reverse(num);
        int r2 = reverse(r1);
        return r2 == num;
    }
    public int reverse(int num)
    {
       int r= 0;
        while (num != 0) {
            int digit = num % 10;
            r = r * 10 + digit;
            num /= 10;
        }
        return r;
    }
}