class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for(char c : jewels.toCharArray()){
            set.add(c);
        }
        int count = 0;
        for(char ch : stones.toCharArray()){
            if(set.contains(ch))
                count++;
        }
        return count;
    }
}