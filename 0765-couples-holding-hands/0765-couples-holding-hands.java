class Solution{
    public int minSwapsCouples(int[] row){
        int n=row.length,swaps=0;
        int[] pos=new int[n];
        for(int i=0;i<n;i++)pos[row[i]]=i;
        for(int i=0;i<n;i+=2){
            int first=row[i],partner=first^1;
            if(row[i+1]!=partner){
                swaps++;
                int p=pos[partner];
                
                int temp=row[i+1];
                row[i+1]=partner;
                row[p]=temp;

                pos[temp]=p;
                pos[partner]=i+1;
            }
        }
        return swaps;
    }
}
