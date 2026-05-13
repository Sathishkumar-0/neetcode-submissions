class Solution {
    public boolean isIsomorphic(String s, String t) {
        LinkedHashMap<Character,Character> map = new LinkedHashMap<>();
        LinkedHashMap<Character,Character> reversMap = new LinkedHashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char s1=s.charAt(i);
            char t1=t.charAt(i);
            if(map.containsKey(s1)){
                if(map.get(s1)!=t1){
                    return false;
                }
            }else{
                map.put(s1,t1);
            }
            if(reversMap.containsKey(t1)){
                if(reversMap.get(t1)!=s1){
                    return false;
                }
            }else{
                reversMap.put(t1,s1);
            }
        }
        
        return true;
    }
}