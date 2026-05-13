class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(String s:arr){
            if(map.containsKey(s)){
                int c=map.get(s);
                map.put(s,c+1);
            }else{
                map.put(s,1);
            }
        }
        Set<String> keys = map.keySet();
        int count=0;
        for(String key:keys){
            if(map.get(key)==1){
                count++;
            }
            if(count==k){
                return key;
            }
        }
        return "";
    }
}