class Solution {
    public int compress(char[] chars) {
        int c=1;
        StringBuilder com = new StringBuilder();
        int n = chars.length;
        for(int i=1;i<n;i++)
        {
            if(chars[i]==chars[i-1])
                c++;
            else{
                com.append(chars[i-1]);
                if(c>1)
                   com.append(c);
                c=1;   
            }    
            
        }
         com.append(chars[n-1]);
        if(c>1)
           com.append(c);

        for(int i=0 ; i<com.length();i++)
        {
            chars[i]=com.charAt(i);
        }           
        return com.length();
    }
}