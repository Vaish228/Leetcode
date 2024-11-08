void sortColors(int* a, int ns) {
    int zc=0,oc=0,tc=0;
    for(int i=0;i<ns;i++)
    {
        if(a[i]==0)
           zc++;
        else if(a[i]==1)
           oc++;     
    }
    for(int i=0;i<zc;i++)
    {
        a[i]=0;
    }
    for(int i=zc;i<zc+oc;i++)
    {
        a[i]=1;
    }
    for(int i=zc+oc;i<ns;i++)
    {
        a[i]=2;
    }
}