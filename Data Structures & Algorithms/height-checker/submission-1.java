class Solution {
    public int heightChecker(int[] heights) {
        int res=0;
        int[] arr=heights.clone();
        Arrays.sort(arr);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=arr[i]){
                res++;
            }
        }
        return res;
    }
}