class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0,sum=0,res=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                res=Math.min(res,r-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}