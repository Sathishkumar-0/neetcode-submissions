class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set=new HashSet<>();
        for(char c:allowed.toCharArray()){
            set.add(c);
        }

        int res=words.length;
        for(String w:words){
            for(char c:w.toCharArray()){
                if(!set.contains(c)){
                    res--;
                    break;
                }
            }
        }
        return res;
    }
}