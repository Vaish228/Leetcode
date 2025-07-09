class Solution {
    public boolean isPalindrome(String s) {
        String st = s.toLowerCase().replaceAll("[^a-z0-9]","");
        //  StringBuilder sb = new StringBuilder(st);
        //  String str = sb.reverse().toString();
        //  if(st.equals(str)) return true;
        //  else return false;
        int n = st.length()-1;
        int m = 0;
        while(m<=n){
            if(st.charAt(m)!=st.charAt(n))
                return false;
            m++;
            n--;    
        }
        return true;
    }
}