class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int flag=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=1;i<=nums.length;i++){
            int left=0;
            int right=nums.length-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(nums[mid]==i){
                    flag=1;
                    break;
                }
                if(nums[mid]<i){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            if(flag==0){
                list.add(i);
            }
            flag=0;
        }
        return list;
    }
}