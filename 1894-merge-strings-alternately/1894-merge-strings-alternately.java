class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        // int a = 0, b=0;
        // String res = "";
        // while(a<w1 && b<w2){
        //     res+=word1.charAt(a);
        //     res+=word2.charAt(b);
        //     a++;
        //     b++;
        // }
        // while(a<w1){
        //     res+=word1.charAt(a);
        //     a++;
        // }
        // while(b<w2){
        //     res+=word2.charAt(b);
        //     b++;
        // }
        // return res;

        StringBuilder res = new StringBuilder(w1+w2);
        int max = Math.max(w1,w2);
        for(int i=0;i<max;i++){
            if(i<w1)
                res.append(word1.charAt(i));
            if(i<w2)
                res.append(word2.charAt(i));    
        }
        return res.toString();
    }
}