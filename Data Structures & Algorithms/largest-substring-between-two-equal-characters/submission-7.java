class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int res=-1;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                res=Math.max(res,i-map.get(c)-1);
            }else{
                map.put(c,i);
            }
        }
        return res;
    }
}