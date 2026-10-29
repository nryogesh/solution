class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> a= new HashSet<>();
        for(int i=0;i< candyType.length;i++)
        {
            a.add(candyType[i]);
        }
        int b=candyType.length/2;
         return Math.min(a.size(),b);
    }
   
}