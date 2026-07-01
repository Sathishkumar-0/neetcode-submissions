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

        // char[] ch1=s.toCharArray();
        // Arrays.sort(ch1);
        // char[] ch2=t.toCharArray();
        // Arrays.sort(ch2);

        // if(Arrays.equals(ch1,ch2)){
        //     return true;
        // }
        // return false;
    }
}
