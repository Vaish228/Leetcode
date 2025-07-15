class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> s = new HashSet<>();
        for(char ch : sentence.toCharArray()){
            s.add(ch);
        }
        if(s.size()==26)
            return true;
        else 
            return false;
    }
}