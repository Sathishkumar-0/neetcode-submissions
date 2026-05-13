class Solution {
    public int maxProductDifference(int[] nums) {
       int fSmall=Integer.MAX_VALUE;
       int sSmall=Integer.MAX_VALUE;
       int fLarge=Integer.MIN_VALUE;
       int sLarge=Integer.MIN_VALUE;

       for(int i=0;i<nums.length;i++){
        if(nums[i]<fSmall){
            sSmall=fSmall;
            fSmall=nums[i];
        }else if(nums[i]<sSmall){
            sSmall=nums[i];
        }

        if(nums[i]>fLarge){
            sLarge=fLarge;
            fLarge=nums[i];
        }else if(nums[i]>sLarge){
            sLarge=nums[i];
        }
       }
       return (fLarge*sLarge)-(fSmall*sSmall);
    }
}