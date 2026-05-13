class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int num=0;num<nums.length;num++){
            int diff=target-nums[num];
            if(map.containsKey(diff) && map.get(diff)!=num){
                return new int[]{num,map.get(diff)};
            }
        }
        return new int[]{};
    }
}
