class Solution {
    public boolean hasMatch(String s, String p) {
        int start = p.indexOf("*");
        String str = p.substring(0, start);
        String str2 = p.substring(start + 1, p.length());
        int check = s.indexOf(str);
        String str3 = s.substring(check + str.length(), s.length());
        int check2 = str3.indexOf(str2);
        System.out.println(check + " " + check2);
        if (check == -1 || check2 == -1) {
            return false;
        }
        return true;
    }
}