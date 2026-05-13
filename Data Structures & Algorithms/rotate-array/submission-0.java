class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        sol(nums,0,n-1);
        sol(nums,0,k-1);
        sol(nums,k,n-1);
    }
    public void sol(int nums[],int start,int end){
        while(start<end){
            int temp=nums[end];
            nums[end--]=nums[start];
            nums[start++]=temp;
        }
    }
}