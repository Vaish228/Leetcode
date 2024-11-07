/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* nextGreaterElement(int* n1, int ns1, int* n2, int ns2, int* rs) {
    int* res = (int *) malloc (sizeof(int) * ns1);
    *rs = ns1;
    for(int i=0;i<ns1;i++)
    {
        int f=0;
        res[i] = -1;
        for(int j=0;j<ns2;j++)
        {
            if(n1[i]==n2[j])
               f=1;
                if(f && n1[i]<n2[j])
                {
                   res[i]=n2[j];
                   break;
                }
    

                // for (int k = j + 1; k < ns2; k++) { 
                //     if (n2[k] > n2[j]) {
                //         res[i] = n2[k];
                //         break;
                //     }
                // }
                // break;
                
            
        }
    }
    return res;
}