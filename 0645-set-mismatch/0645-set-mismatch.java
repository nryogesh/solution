class Solution {
    public int[] findErrorNums(int[] nums) {
      int i=0;
   while(i<nums.length)
   {
    int index=nums[i]-1;
    if( nums[i]!=nums[index]){
        swap(nums,i,index);
    }
    else{
        i++;
    }

   }
  
   for(int j=0;j<nums.length;j++)
   {
    if(nums[j]!=j+1)
    {
        return new int[] {nums[j],j+1};
    }}
    return new int[]{-1,-1};
       
    }
    static void swap(int[] nums,int f,int l)
    {
        int temp=nums[f];
        nums[f]=nums[l];
        nums[l]=temp;
    }
}