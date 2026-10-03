class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:chars.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int res=0;
        for(String w:words){
            HashMap<Character,Integer> map1=new HashMap<>();
            boolean found=true;
            for(char c:w.toCharArray()){
                map1.put(c,map1.getOrDefault(c,0)+1);
                if(map1.get(c)>map.getOrDefault(c,0)){
                    found=false;
                    break;
                }
            }
            if(found){
                res+=w.length();
            }
        }
        return res;
    }
}