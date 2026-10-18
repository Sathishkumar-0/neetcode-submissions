class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
    public int atMost(int[] nums,int k){
        if(k<0){
            return 0;
        }
        int left=0,odd=0,res=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]%2!=0){
                odd++;
            }
            while(odd>k){
               if(nums[left]%2!=0){
                odd--;
               }
                left++;
            }
            res+=r-left+1;
        }
        return res;
    }
}
