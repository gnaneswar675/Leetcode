class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap <Integer,Integer> map=new HashMap<>();
        Stack <Integer> stack=new Stack<>();
        int n=nums2.length;
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty()&&nums2[i]>stack.peek())
            {
                map.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }
        int n1=nums1.length;
        for(int i=0;i<n1;i++)
        {
            nums1[i]=map.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}