class Solution {
    public int maxProduct(int[] nums) {
        int res=Integer.MIN_VALUE;
        int pre=1;
        int suf=1;
        for(int i=0;i<nums.length;i++){
            if(pre==0){
                pre=1;
            }
            if(suf==0){
                suf=1;
            }
            pre*=nums[i];
            suf*=nums[nums.length-1-i];
            res=Math.max(res,Math.max(pre,suf));
        }
        return res;
    }
}
