class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
              if(a.containsKey(nums[i]))
            {
                a.put(nums[i],a.get(nums[i])+1);
            }
            else{
                a.put(nums[i],1);
            }
        }int r=0;
        for(int b:a.keySet()){
            if(a.get(b)>1){
            r=b;
            break;

            }
        }
        return r;
    }
}