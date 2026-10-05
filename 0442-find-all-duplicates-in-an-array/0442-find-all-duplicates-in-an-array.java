class Solution {
    public List<Integer> findDuplicates(int[] nums) {
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
   List<Integer> ans= new ArrayList<>();
   for(int j=0;j<nums.length;j++)
   {
    if(nums[j]!=j+1)
    {
        ans.add(nums[j]);
    }}
    return ans;
       
    }
    static void swap(int[] nums,int f,int l)
    {
        int temp=nums[f];
        nums[f]=nums[l];
        nums[l]=temp;
    }
}
  