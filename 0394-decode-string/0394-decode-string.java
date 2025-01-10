class Solution {
    int i=0;
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        int c=0;
        
        String t = "";
        while(i<s.length())
        {
            char ch = s.charAt(i);
            i++;
            if(ch == '[')
            {
                t=decodeString(s);
                int j = 0;
                while(j < c){
                    sb.append(t);
                    j++;
                }
                c=0;
            }
            else if(ch==']')
                break;
            else if(Character.isAlphabetic(ch))
                sb.append(ch);
            else
                c=c*10+ch-'0';        
        }
        return sb.toString();
    }
}