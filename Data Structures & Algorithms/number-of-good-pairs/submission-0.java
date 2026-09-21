class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int count:map.values()){
            res+=count*(count-1)/2;
        }
        return res;
    }
}