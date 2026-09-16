class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int res=0;
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)%2==0){
                res+=2;
            }
        }
        for(int cnt:map.values()){
            if(cnt%2==1){
                res+=1;
                break;
            }
        }
        return res;
    }
}