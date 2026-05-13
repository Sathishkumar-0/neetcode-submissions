class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> tMap=new HashMap<>();
        for(int i=0;i<t.length();i++){
            tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i),0)+1);
        }

        HashMap<Character,Integer> sMap=new HashMap<>();
        int left=0,count=t.length();
        int min=Integer.MAX_VALUE;
        String ans="";
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            sMap.put(ch,sMap.getOrDefault(ch,0)+1);
            if(tMap.containsKey(ch) && sMap.get(ch) <= tMap.get(ch)){
                count--;
            }
            while(count==0){
                if(right-left+1 < min){
                    min=right-left+1;
                    ans=s.substring(left,right+1);
                }
                char c=s.charAt(left);
                sMap.put(c,sMap.get(c)-1);
                if(tMap.containsKey(c) && sMap.get(c) < tMap.get(c)){
                    count++;
                }
                left++;
            }
        }
        return ans;
    }
}
