class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0,i=0,count=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(j-i+1>k){
                sum-=arr[i];
                i++;
            }
            if(j-i+1==k&&sum/k>=threshold){
                count++;
            }
        }
        return count;
    }
}