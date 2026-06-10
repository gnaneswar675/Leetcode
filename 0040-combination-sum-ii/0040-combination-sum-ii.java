class Solution {
    public static void traverse(int cur,int arr[],int target,List<Integer> list,List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=cur;i<arr.length;i++){
            if(i>cur && arr[i]==arr[i-1]) continue;
            if(arr[i]>target)break;

            list.add(arr[i]);
            traverse(i+1,arr,target-arr[i],list,res);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<Integer>list=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        traverse(0,arr,target,list,res);
        return res;
    }
}