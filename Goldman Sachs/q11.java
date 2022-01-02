class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
      
        int r=0;
        int mis=0;
    
      
        for( int i=0;i<n;i++)
        {
            int val=Math.abs(arr[i]);
            if(arr[(val-1)]>0)
            {
                arr[val-1]=-arr[val-1];
            }
            else
            {
                r=val;
            }
        }
        for(int j=0;j<n;j++)
        {
            if(arr[j]>0)
            {
                mis=j+1;
            }
        }
        arr[0]=r;
        arr[1]=mis;
        return arr;
        
    }
    
}