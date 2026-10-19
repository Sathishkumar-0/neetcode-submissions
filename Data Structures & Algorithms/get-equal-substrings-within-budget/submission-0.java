class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left=0,curCost=0,max=0;
        for(int right=0;right<s.length();right++){
            curCost+=Math.abs(s.charAt(right)-t.charAt(right));
            while(curCost>maxCost){
                curCost-=Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}
