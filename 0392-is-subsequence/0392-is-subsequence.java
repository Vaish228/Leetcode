class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int j=0,c=0;
        for(int i=0;i<t.length();i++){
            if(s.charAt(j)==t.charAt(i)){
                c++;
                if(j<s.length()-1)
                    j++;
            }
        }
        if(c==s.length()) 
            return true;
        else
            return false;    
    }
}