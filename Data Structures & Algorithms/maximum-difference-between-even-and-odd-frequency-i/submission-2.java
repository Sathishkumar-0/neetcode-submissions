class Solution {
    public int maxDifference(String s) {

        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        } 
        int oddmax=0;
        int mineven=Integer.MAX_VALUE;
        for(int f:freq){
            if(f==0) continue;
            if(f%2==1){
                oddmax=Math.max(oddmax,f);
            }else{
                mineven=Math.min(mineven,f);
            }
        }
        return oddmax-mineven;
    }
}