class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> map=new TreeMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        String[] res=new String[map.size()];
        int l=res.length-1;
        Set<Integer> keys=map.keySet();
        for(int key:keys){
            res[l--]=map.get(key);
        }
        return res;
    }
}