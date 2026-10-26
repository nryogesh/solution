class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> a= new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(nums[i]%2==0){
            if(a.containsKey(nums[i])){
                a.put(nums[i],a.get(nums[i])+1);
            }
            else{
                a.put(nums[i],1);
            }}
        }
        int max=0; 
        int ans=-1;       
        for(int b:a.keySet()){
            int currentfre=a.get(b);
          if(currentfre > max || (currentfre == max && b < ans)){
            max=currentfre;
            ans=b;

          }}
            return ans;
       
    }
}