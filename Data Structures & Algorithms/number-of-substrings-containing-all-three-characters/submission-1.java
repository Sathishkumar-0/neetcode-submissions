class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int[] fre=new int[3];
        int left=0,count=0;
        for(int right=0;right<s.length();right++){
            fre[s.charAt(right)-'a']++;
            while(fre[0]>0 && fre[1]>0 && fre[2]>0){
                count+=n-right;
                fre[s.charAt(left)-'a']--;
                left++;
            } 
        }
        return count;
    }
}
