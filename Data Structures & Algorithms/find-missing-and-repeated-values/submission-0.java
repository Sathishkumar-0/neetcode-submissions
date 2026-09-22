class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set=new HashSet<>();
        int repeat=0,missing=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(set.contains(grid[i][j])){
                    repeat=grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }

        for(int num=1;num<=grid.length*grid.length;num++){
            if(!set.contains(num)){
                missing=num;
                break;
            }
        }
        return new int[]{repeat,missing};
    }
}