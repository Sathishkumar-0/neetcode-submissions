class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str=s.split(" ");
        if(pattern.length()!=str.length){
            return false;
        }
        LinkedHashMap<Character,String> map = new LinkedHashMap<>();
        LinkedHashMap<String,Character> reverse = new LinkedHashMap<>();
        for(int i=0;i<pattern.length();i++){
            char a=pattern.charAt(i);
            String b=str[i];
            if(map.containsKey(a)){
                if(!map.get(a).equals(b)){
                    return false;
                }
            }else{
                map.put(a,b);
            }
            if(reverse.containsKey(b)){
                if(reverse.get(b)!=a){
                    return false;
                }
            }else{
                reverse.put(b,a);
            }
        }
        return true;
    }
}