class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int res=-1;
        Set<Integer> keys=map.keySet();
        for(int key:keys){
            if(key==map.get(key)){
                res=Math.max(res,key);
            }
        }
        return res;
    }
}