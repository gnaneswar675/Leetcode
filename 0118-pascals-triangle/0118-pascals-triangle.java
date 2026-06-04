class Solution {
    public List<Integer> rowgen(int n){
        int ans=1;
        List <Integer> res=new ArrayList<>();
        res.add(ans);
        for(int c=1;c<n;c++){
            ans=ans*(n-c);
            ans=ans/c;
            res.add(ans);
        }return res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            res.add(rowgen(i));
        }
        return res;
    }
}