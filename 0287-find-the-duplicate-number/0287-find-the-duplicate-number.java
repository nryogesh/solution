class Solution {
    public int findDuplicate(int[] nums) {
       
       int i=0;
       
   while(i<nums.length)
   {
    if(nums[i]!=i+1){
          int index=nums[i]-1;
    if( nums[i]!=nums[index]){
        swap(nums,i,index);
    }else{
        return nums[i];
    }
    }
  
    else{
        i++;
    }

   } return -1;

    }
    static void swap(int[] nums,int f,int l)
    {
        int temp=nums[f];
        nums[f]=nums[l];
        nums[l]=temp;
    }
}