class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0) return new int[0][0];
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>();
        for(int[] i : intervals){
            if(list.isEmpty()||list.get(list.size()-1)[1] < i[0])
                list.add(i);
            else
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1] , i[1]);    
        }
        return list.toArray(new int[list.size()][]);

    }
}