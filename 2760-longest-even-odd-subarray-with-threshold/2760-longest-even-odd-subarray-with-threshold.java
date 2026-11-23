class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int a=0; 
        int b=0; 
        for(int i=0;i<nums.length;i++){
            if(nums[i]>threshold){
                b = 0;
            } else if (b>0 && nums[i]%2!=nums[i-1]%2){
                b++;
            } else {
                b=(nums[i]%2==0)?1:0;
            }
            
            a=Math.max(a,b);
        }
        
        return a;
    }
}

   