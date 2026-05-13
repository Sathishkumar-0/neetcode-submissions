class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[n-k+1];
        Deque<Integer> q=new LinkedList<>();
        for(int right=0;right<n;right++){
            
            while(!q.isEmpty() && q.peekFirst() <= right-k){
                q.pollFirst();
            }
            while(!q.isEmpty() && nums[q.peekLast()]<nums[right]){
                q.pollLast();
            }
            q.addLast(right);
            if(right >= k-1){
                res[right-k+1]=nums[q.peekFirst()];
            }
        }
        return res;
    }
}
