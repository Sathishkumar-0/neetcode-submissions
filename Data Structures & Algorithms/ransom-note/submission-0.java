class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count=new int[26];
        for(char a:magazine.toCharArray()){
            count[a-'a']++;
        }
        for(char a:ransomNote.toCharArray()){
            count[a-'a']--;
            if(count[a-'a']<0){
                return false;
            }
        }
        return true;
    }
}