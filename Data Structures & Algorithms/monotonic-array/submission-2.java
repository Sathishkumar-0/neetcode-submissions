class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean lfound=false;
        boolean rfound=false;
        int l=0,r=1;
        while(r<nums.length){
            if(nums[l]<=nums[r] && rfound==false){
                l++;
                r++;
                lfound=true;
            }else if(nums[l]>=nums[r] && lfound==false){
                l++;
                r++;
                rfound=true;
            }else{
                return false;
            }
        }
        return true;
    }
}