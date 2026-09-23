class Solution {
    
    public int search(int[] nums, int target) {
        
        int pivot=findpivot(nums);
        if (pivot==-1)
        {
            return binarysearch(nums , target, 0, nums.length-1);

        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
             return binarysearch( nums , target, 0, pivot-1);
        }
        return binarysearch( nums , target, pivot+1, nums.length-1);
        
        
    }
    static int binarysearch(int[] nums,int target ,int s, int e)
    {
       
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(target>nums[mid])
            {
                s=mid+1;
        }
        else if(target<nums[mid])
        {
            e=mid-1;
        }
        else
        return mid;
    }
    return -1;
}
static int  findpivot(int[] arr )
{   
    int s=0;
    int e=arr.length-1;
    while(s<=e)
    {
        int mid=(s+e)/2;
        if(mid<e && arr[mid]>arr[mid+1])
        {
           return mid;
        }
        
        if(mid>s && arr[mid] <arr[mid-1])
        {
            return mid-1;
        }
        

        if(arr[mid]>arr[s])
        {
           
             s=mid+1;
        }
        else
        e=mid-1;

    }
    return -1;
}
}