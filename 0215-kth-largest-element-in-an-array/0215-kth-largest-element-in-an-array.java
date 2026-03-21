class Solution {
    public int findKthLargest(int[] nums, int n) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:nums){
            pq.add(x);
            if(pq.size()>n){
                pq.poll();
            }
        }
        return pq.peek();
    }
}