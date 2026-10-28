class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> a= new HashMap<>();
        for(int i=0;i<nums.length;i++){
             if(a.containsKey(nums[i])){
                a.put(nums[i],a.get(nums[i])+1);
             }
             else{
                a.put(nums[i],1);
             }
        }
        int i=0;
       int[] d= new int[2];
        for(int b: a.keySet())
        {
            if (a.get(b)==1){
                d[i++]=b;

            }
        }
      
       return d;
    }
}