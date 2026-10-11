class Solution {
    public int[] transformArray(int[] nums) {
            for(int j=0;j<nums.length;j++)
            {
                if((nums[j]%2)==0)
                {
                   nums[j]=0; 
                }
                else{
                    nums[j]=1;
                }
            
        }Arrays.sort(nums);
        return nums;
    }
}