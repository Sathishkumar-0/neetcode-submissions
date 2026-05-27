class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false; 
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char a:t.toCharArray()){
            if(!map.containsKey(a) || map.get(a)==0){
                return false;
            }
            map.put(a,map.get(a)-1);
        }
        return true;
    }
}
