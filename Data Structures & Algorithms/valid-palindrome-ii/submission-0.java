class Solution {
    public boolean validPalindrome(String s) {
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return isPalindrome(s.substring(0,left)+s.substring(left+1))||
                isPalindrome(s.substring(0,right)+s.substring(right+1));
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isPalindrome(String a){
        int i=0, j=a.length()-1;
        while(i<j){
            if(a.charAt(i)!=a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}