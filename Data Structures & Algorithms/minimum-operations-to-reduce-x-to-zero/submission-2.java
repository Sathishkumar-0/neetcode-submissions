class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        int target=totalSum-x;
        if(target==0){
            return nums.length;
        }
        if(target<0){
            return -1;
        }
        int left=0,sum=0,max=-1;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>target && left<=r){
                sum-=nums[left];
                left++;
            }
            if(sum==target){
                max=Math.max(max,r-left+1);
            }
        }
        return max==-1?-1:nums.length-max;
    }
}
