class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return find(nums,goal)-find(nums,goal-1);
    }
    public int find(int[] nums,int goal){
        if(goal<0)return 0;
        int res=0,l=0,sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            res+=r-l+1;
        }
        return res;
    }
}