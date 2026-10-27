class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
       ArrayList<Integer> r= new ArrayList<>();
        for(int b: map.keySet()){
            if(map.get(b)>nums.length/3){
                r.add(b);
                
            }
        }
        return r;
    }
}