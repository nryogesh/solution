class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int neg = binarySearch(nums, 0);
        int pos = n - binarySearch(nums, 1);
        return Math.max(neg, pos);
    }
    
    private int binarySearch(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
