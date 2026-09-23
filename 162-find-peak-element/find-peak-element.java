class Solution {
    public int findPeakElement(int[] arr) {
         int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=(s+e)/2;
            if(arr[mid]>arr[mid+1]){
            // arr is in decrasing order which mean mid is bigger so search frm mid to left
            e=mid;

        }
        else{
            //if mid<mid+1
            //arr is in increasing order so start after mid  as mid+1is bigger
            s=mid+1;
        }
        
    }
    return s;
        
    }
}