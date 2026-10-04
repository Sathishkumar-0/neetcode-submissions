class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> map=new HashSet<>();
        int x=0,y=0;
        map.add(x+","+y);
        for(char c:path.toCharArray()){
            if(c=='N') y++;
            else if(c=='S') y--;
            else if(c=='E') x++;
            else if(c=='W') x--;
            
            String pos=x+","+y;
            if(map.contains(pos)){
                return true;
            }
            map.add(pos);
        }
        return false;
    }
}