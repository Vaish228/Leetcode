class Solution {
    public int minimumSum(int num) {
        String s=String.valueOf(num);
        int a[]=new int[s.length()];
        int i=0;
        while(num!=0){
            a[i]=num%10;
            num/=10;
            i++;
        }
        Arrays.sort(a);
        int e=0,o=0;
        for(i=0;i<s.length();i++)
        {
            if(i%2!=0)
            e=e*10+a[i];
            else
            o=o*10+a[i];
        }
        return e+o;
    }
}
