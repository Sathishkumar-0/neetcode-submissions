class Solution {
    public int maxScore(String s) {
        int res=0;
        for(int i=0;i<s.length()-1;i++){
            int zCount=zero(s.substring(0,i+1));
            int oCount=one(s.substring(i+1));
            res=Math.max(res,zCount+oCount);
        }
        return res; 
    }

    public int zero(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                count++;
            }
        }
        return count;
    }

    public int one(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}