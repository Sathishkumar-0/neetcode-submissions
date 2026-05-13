class Solution {
    public boolean isPalindrome(String s) {
        
        if(s.isEmpty()){
            return true;
        }
        int start=0, last=s.length()-1;
        while(start<last){
            char a = s.charAt(start);
            char b = s.charAt(last);
            if(!Character.isLetterOrDigit(a)){
                start++;
            }else if(!Character.isLetterOrDigit(b)){
                last--;
            }else if(Character.toLowerCase(a)==Character.toLowerCase(b)){
                start++;
                last--;
            }else{
                return false;
            }
        }
        return true;
    }
}
