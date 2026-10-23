class Solution {
    public int mySqrt(int x) {
        int l=1;
        int r=x;
        while(l<=r){
            int mid=l+(r-l)/2;
            long square=(long)mid*mid;
            if(square==x)
            {
                return mid;
            }
            else if(square<x)
            {
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return r;
    }
}