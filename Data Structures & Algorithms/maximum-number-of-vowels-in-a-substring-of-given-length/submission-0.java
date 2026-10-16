class Solution {
    public int maxVowels(String s, int k) {
        int vCount=0,l=0,r=0,res=0;
        while(r<s.length()){
            if(s.charAt(r)=='a'||s.charAt(r)=='e'||s.charAt(r)=='i'||s.charAt(r)=='o'||s.charAt(r)=='u'){
                vCount++;
            }
            if(r-l+1==k){
              res=Math.max(res,vCount);  if(s.charAt(l)=='a'||s.charAt(l)=='e'||s.charAt(l)=='i'||s.charAt(l)=='o'||s.charAt(l)=='u'){
                    vCount--;
                }
                l++;
            }
            r++;
        }
        return res;
    }
}
