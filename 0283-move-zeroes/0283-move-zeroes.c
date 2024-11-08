void moveZeroes(int* n, int ns) {
    int c=0;
    for(int i=0;i<ns;i++)
    {
        if(n[i]!=0)
        {
            int t = n[i];
            n[i]=n[c];
            n[c]=t;
            c++;
        }
       
    }

}