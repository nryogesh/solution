class Solution {
    public int maximumProduct(int[] nums) {
    Arrays.sort(nums);
        int b=1;
         for (int i = nums.length-1; i>= nums.length-3;i--) 
        {
            b=b*nums[i];
        }
       int n =nums[0]*nums[1]*nums[nums.length-1];
        
        return Math.max(b, n);
    }
}