class Solution {
    Map<Character, String> map;
    public void backtracking(List<String> l, String digits, StringBuilder sb, int in)
    {
        if(sb.length()==digits.length())
        {
            l.add(sb.toString());
            return;
        }
        String le = map.get(digits.charAt(in));
        for(int i=0;i<le.length();i++)
        {
            sb.append(le.charAt(i));
            backtracking(l,digits, sb, in+1);
            sb.setLength(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> l = new ArrayList<>();
        if(digits.isEmpty())
            return l;


        map = new HashMap<>();    
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        backtracking(l, digits, new StringBuilder(), 0);
        return l;
    }

}