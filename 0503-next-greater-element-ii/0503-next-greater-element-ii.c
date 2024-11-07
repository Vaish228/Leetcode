/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* nextGreaterElements(int* n, int ns, int* rs) {
    int* res = (int*)malloc(sizeof(int)*ns);
    int dn = 2*ns;
    int * dou = (int*)malloc(sizeof(int)*dn);

    for(int i=0;i<ns;i++)
    {
        res[i]=-1;
        for (int j =1; j < ns; j++) {
            int circularIndex = (i + j) % ns;
            if (n[circularIndex] > n[i]) {
                res[i] = n[circularIndex];
                break; 
            }
        }
    }

    // for(int i=0;i<ns;i++)
    // {
    //     dou[i]=n[i];
    // }
    // for(int i=0;i<ns;i++)
    // {
    //     dou[ns+i]=n[i];
    // }

    // for(int i=0;i<ns;i++)
    // {
    //     res[i]=-1;
    //     for(int j=i+1;j<dn;j++)
    //     {
    //        if (dou[j] > dou[i]) { 
    //             res[i] = dou[j];  
    //             break; 
    //        }
    //     }
    // }
    *rs = ns;
    return res;
}