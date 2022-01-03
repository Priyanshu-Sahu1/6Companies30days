class Solution {
    int doOverlap(int L1[], int R1[], int L2[], int R2[]) {
        // code here
        int c=1;
        if(R1[0]<L2[0] || R2[0]<L1[0])
        {
            c=0;
            return c;
        }
        if(R1[1]>L2[1] || R2[1]>L1[1])
        {
            c=0;
            return c;
        }
        return c;
}
}