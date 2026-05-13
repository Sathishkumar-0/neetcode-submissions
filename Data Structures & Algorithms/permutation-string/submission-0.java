class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] fre1=new int[26];
        int[] fre2=new int[26];
        for(int i=0;i<s1.length();i++){
            fre1[s1.charAt(i)-'a']++;
        }

        int left=0;
        for(int r=0;r<s2.length();r++){
            fre2[s2.charAt(r)-'a']++;

            if(r-left+1 > s1.length()){
                fre2[s2.charAt(left)-'a']--;
                left++;
            }

            if(r-left+1 == s1.length()){
                boolean isMatch=true;
                for(int i=0;i<26;i++){
                    if(fre1[i]!=fre2[i]){
                        isMatch=false;
                        break;
                    }
                }
                if(isMatch){
                    return true;
                }
            }
        }
        return false;
    }
}
