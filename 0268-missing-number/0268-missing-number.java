class Solution {
    public int missingNumber(int[] nums) {
   int i=0;
   while(i<nums.length)
   {
    int index=nums[i];
    if(nums[i]<nums.length && nums[i]!=nums[index]){
        swap(nums,i,index);
    }
    else{
        i++;
    }

   }
   for(int j=0;j<nums.length;j++)
   {
    if(nums[j]!=j)
    {
        return j;
    }}
    return nums.length;
       
    }
    static void swap(int[] nums,int f,int l)
    {
        int temp=nums[f];
        nums[f]=nums[l];
        nums[l]=temp;
    }
}