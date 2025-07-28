class Solution {
    public boolean strongPasswordCheckerII(String password) {
         if(password.length()<8) return false;
         boolean hu = false;
         boolean hl = false;
         boolean hd = false;
         boolean hs = false;

         for(int i=0;i<password.length();i++)
         {
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch))  hu = true;
            else if(Character.isLowerCase(ch)) hl = true;
            else if(Character.isDigit(ch)) hd = true;
            else if("!@#$%^&*()-+".indexOf(ch)>=0)  hs = true;

            if(i>0 && ch==password.charAt(i-1)) return false; 
         }

         return hu && hl && hs && hd;
    }
}