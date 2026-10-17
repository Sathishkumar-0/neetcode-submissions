class Solution {
    public int minFlips(String s) {
        int n=s.length();
        int flip0=0,flip1=0;
        int ans=n;

        String doubled=s+s;
        for(int i=0;i<2*n;i++){
            char c=doubled.charAt(i);
            char exp0=(i%2==0)?'0':'1';
            char exp1=(i%2==0)?'1':'0';
            if(c!=exp0)flip0++;
            if(c!=exp1)flip1++;
            if(i>=n){
                char removed=doubled.charAt(i-n);
                char rem0=((i-n)%2==0)?'0':'1';
                char rem1=((i-n)%2==0)?'1':'0';
                if(removed!=rem0)flip0--;
                if(removed!=rem1)flip1--;
            }
            if(i>=n-1){
                ans=Math.min(ans,Math.min(flip0,flip1));
            }
        }
            return ans;
    }
}
