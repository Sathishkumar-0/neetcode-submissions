class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(String w:words){
            for(char c:w.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        for(int num:map.values()){
            if((num%words.length)!=0){
                return false;
            }
        }
        return true;
    }
}