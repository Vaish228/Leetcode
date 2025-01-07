class Solution {
public:
    int myAtoi(string s) {
         int n = 0;
        int sign = 1;
        int i = 0;
        int l = s.length();
        while (i < l  && s[i] == ' ') {
            i++;
        }

        if (i < l && s[i] == '-') {
            sign = -1;
            i++;
        } 
        else if (i < l && s[i] == '+') {
            i++;
        }
        while (i < l && s[i] >= '0' && s[i] <= '9') {
            if (n > (INT_MAX - (s[i] - '0')) / 10) {
                return sign == 1 ? INT_MAX : INT_MIN;
            }

            n = n * 10 + (s[i] - '0');
            i++;
        }

        return sign * n;
    }
};