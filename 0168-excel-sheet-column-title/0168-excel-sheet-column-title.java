class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0){
            n--;
            char ch = (char)('A'+n%26);
            sb.append(ch);
            n/=26;
        }
        return sb.reverse().toString();
    }
}