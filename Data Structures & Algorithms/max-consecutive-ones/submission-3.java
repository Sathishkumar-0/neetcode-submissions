class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int res=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]==1){
                count++;
            }else{
                res=Math.max(res,count);
                count=0;
            }
            j++;
        }
        res=Math.max(res,count);
        return res;
    }
}