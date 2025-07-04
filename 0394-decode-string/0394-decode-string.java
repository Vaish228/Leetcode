class Solution {
    public String decodeString(String s) {
        Stack<Integer> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();
        int cn = 0;
        String cs ="";
        for(char c: s.toCharArray())
        {
            if(Character.isDigit(c))
                cn = cn * 10 + c - '0';
            else if(c == '[')
            {
                s1.push(cn);
                s2.push(cs);
                cn=0;
                cs="";
            }    
            else if(c==']')
            {
                int k = s1.pop();
                StringBuilder sb = new StringBuilder(s2.pop());
                for(int i=0;i<k;i++)
                {
                    sb.append(cs);
                }
                cs = sb.toString();
            }
            else{
                cs+=c;
            }
        }
        return cs;
    }
}