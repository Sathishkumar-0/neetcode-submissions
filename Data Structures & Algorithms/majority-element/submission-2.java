class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int c=map.get(nums[i]);
                map.put(nums[i],c+1);
            }else{
                map.put(nums[i],1);
            }
        }
        Set<Integer> keys = map.keySet();
        for(int key:keys){
            if(map.get(key) > (nums.length/2)){
                return key;
            }
        }
        return 0;
    }
}