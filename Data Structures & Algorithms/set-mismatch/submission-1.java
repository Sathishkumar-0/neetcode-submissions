class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] count=new int[nums.length+1];
        int[] res=new int[2];

        for(int num:nums){
            count[num]++;
        }

        for(int i=1;i<=nums.length;i++){
            if(count[i]==0){
                res[1]=i;
            }
            if(count[i]==2){
                res[0]=i;
            }
        }
        return res;
    }
}