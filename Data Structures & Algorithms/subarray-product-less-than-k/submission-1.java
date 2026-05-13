class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0, prod=1, count=0;
        if(k<=1){
            return 0;
        }
        for(int r=0;r<nums.length;r++){
            prod*=nums[r];
            while(prod>=k){
                prod/=nums[left];
                left++;
            }
            count+=r-left+1;
        }
        return count;
    }
}