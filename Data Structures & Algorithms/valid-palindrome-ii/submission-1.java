class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return isPalli(s.substring(0,i)+s.substring(i+1)) ||
                isPalli(s.substring(0,j)+s.substring(j+1));
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean isPalli(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}