//using extra space
/*class Solution {
    public static void traverse(int nums[],boolean[] flag,List<Integer> list,List<List<Integer>> res){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!flag[i]){
                flag[i]=true;
                list.add(nums[i]);
                traverse(nums,flag,list,res);
                flag[i]=false;
                list.remove(list.size()-1);

            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer>list=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        boolean[] flag=new boolean[nums.length];
        traverse(nums,flag,list,res);
        return res;
    }
}
*/
//without extra space
class Solution {
    public static void traverse(int nums[],int cur,List<List<Integer>> res){
        if(cur==nums.length){
           List<Integer>list=new ArrayList<>();
           for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
           }res.add(list);
           return;
        }
        for(int i=cur;i<nums.length;i++){
            swap(i,cur,nums);
            traverse(nums,cur+1,res);
            swap(i,cur,nums);
        }
    }
    public static void swap(int a,int b,int nums[]){
        int t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer>list=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();        
        traverse(nums,0,res);
        return res;
    }
}
