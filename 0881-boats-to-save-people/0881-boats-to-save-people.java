class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int c=0;
        Arrays.sort(people);
        int k=0;
        int j=people.length-1;
        
        while(k<=j){
                if(people[k]+people[j]<=limit){
                c++;
                k++;
                j--;}
                else
                if(people[k]<=limit){
                j--;
                c++;}
        }       
    return c;
    }
}