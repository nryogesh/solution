class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> a=new HashMap<>();
        for(char c:s.toCharArray()){
            a.put(c,a.getOrDefault(c,0)+1);
        }
        for(char d:t.toCharArray()){
            if(!a.containsKey(d) || a.get(d)==0){
                return d;
                
            }
             a.put(d, a.get(d) - 1);
        }
        return ' ';
    }
}