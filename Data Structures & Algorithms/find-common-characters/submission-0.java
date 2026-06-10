class Solution {
    public List<String> commonChars(String[] words) {
        int[] minfreq=new int[26];
        Arrays.fill(minfreq, Integer.MAX_VALUE);
        
        for(String word:words){
            int[] freq=new int[26];
            for(char ch:word.toCharArray()){
                freq[ch-'a']++;
            }
            for(int i=0;i<26;i++){
                minfreq[i]=Math.min(freq[i],minfreq[i]);
            }
        }
        List<String> list=new ArrayList<>();
        for(int i=0;i<26;i++){
            while(minfreq[i]>0){
                list.add(String.valueOf((char)(i+'a')));
                minfreq[i]--;
            }
        }
        return list;
    }
}