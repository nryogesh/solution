class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> a=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            char currentStone = stones.charAt(i); 
            if (a.containsKey(currentStone)) {
                a.put(currentStone, a.get(currentStone) + 1);
            } else {
                a.put(currentStone, 1);
            }
        }int sum=0;
        for(char k:jewels.toCharArray()){
            if(a.containsKey(k)){
                sum=sum+a.get(k);
            }

            
        }
        return sum;

    }
}