class Solution {
    public int findMinMoves(int[] machines) {
        int s=0;
        for(int i=0;i<machines.length;i++)
            s+=machines[i];
        if(s%machines.length != 0)
            return -1;
        int avg = s/machines.length;
        int c=0;
        int max =0;
        for(int i=0;i<machines.length;i++)
        {
            c+=machines[i]-avg;
            max = Math.max(max, Math.max(Math.abs(c),machines[i]-avg));
        }        
        return max;
    }
}