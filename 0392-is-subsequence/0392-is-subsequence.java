class Solution {
    public boolean isSubsequence(String s, String t) {
        int tp = 0;
        int sp = 0;
        while(tp<t.length() && sp<s.length()){
            if(t.charAt(tp)==s.charAt(sp))
                sp++;
            tp++;    
        }
         return sp==s.length() ? true: false;
    }
}