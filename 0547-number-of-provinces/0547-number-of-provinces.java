class Solution {
    public void dfs(int[][]m ,int []arr,int i){
        for(int j=0;j<m.length;j++){
            if(m[i][j]==1&&arr[j]==0){
                arr[j]=1;
                dfs(m,arr,j);
            }
        }
    }
    public int findCircleNum(int[][] mat) {
        int arr[]=new int[mat.length];
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                dfs(mat,arr,i);
                res++;
            }
        }return res;
    }
}