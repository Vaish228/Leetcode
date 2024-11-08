int trap(int* h, int n) {
    int lm=0, rm=0;
    int l=0,r=n-1;
    int c=0;
    while(l<r)
    {
        if(h[l]<h[r])
        {
            if(lm<h[l])
            {
                lm = h[l];
            }
            else
            {
                c = c + lm - h[l];
            }
            l++;
        }
        else
        {
            if(rm<h[r])
            {
                rm = h[r];
            }
            else
            {
                c = c + rm - h[r];
            }
            r--;
        }
    }
    return c;
}
    // for(int i=0;i<n;i++)
    // {
    //     if((h[i]<rm)&&(lm>h[i]))
    //     {
    //         lm=h[i];
    //         c++;
    //     }
    // }