class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char l : letters)
        {
            if(target<l)
                return l;
        }
        return letters[0];
    }
}