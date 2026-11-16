class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double a=0;
        double b=0;
        for(int i=0;i<k;i++){
            a+=nums[i];
        }
        b=a/k;
        for(int j=k;j<nums.length;j++){
            a+=nums[j]-nums[j-k];
            double c=a/k;
            b=Math.max(b,c);
        }
        return b;
    }
}