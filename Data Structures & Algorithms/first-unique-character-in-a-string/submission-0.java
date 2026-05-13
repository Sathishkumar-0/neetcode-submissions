class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int c=map.get(s.charAt(i));
                map.put(s.charAt(i),c+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        Set<Character> keys = map.keySet();
        for(char key : keys){
            if(map.get(key)==1){
                return s.indexOf(key);
            }
        }
        return -1;
    }
}