class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int l=0,r=nums.length-1,i=nums.length-1;
        while(l<=r){
            if((nums[l]*nums[l])>(nums[r]*nums[r])){
                res[i--]=nums[l]*nums[l];
                l++;
            }else{
                res[i--]=nums[r]*nums[r];
                r--;
            }
        }
        return res;
    }
}