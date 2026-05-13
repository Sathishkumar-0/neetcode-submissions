class Solution {
    public boolean isPerfectSquare(int num) {
        long left=1, right=num;
        while(left<=right){
            long m=left+(right-left)/2;
            if(m*m >num){
                right=m-1;
            }else if(m*m < num){
                left=m+1;
            }else{
                return true;
            }
        }
        return false;
    }
}