class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
        int i=0,j=people.length-1;
        while(i<=j){
            int sum=people[i]+people[j];
            if(sum>limit){
                if(people[j]<=limit){
                    count++;
                }
                j--;
            }else if(sum<=limit){
                count++;
                i++;
                j--;
            }
        }
        return count;
    }
}