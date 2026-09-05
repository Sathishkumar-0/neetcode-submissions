class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] fre1=new int[26];
        int[] fre2=new int[26];
        for(int i=0;i<s1.length();i++){
            fre1[s1.charAt(i)-'a']++;
        }
        int left=0;
        for(int i=0;i<s2.length();i++){
            fre2[s2.charAt(i)-'a']++;
            if(i-left+1>s1.length()){
                fre2[s2.charAt(left)-'a']--;
                left++;
            }
            if(i-left+1==s1.length()){
                boolean isMatch=true;
                for(int j=0;j<26;j++){
                    if(fre1[j]!=fre2[j]){
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
