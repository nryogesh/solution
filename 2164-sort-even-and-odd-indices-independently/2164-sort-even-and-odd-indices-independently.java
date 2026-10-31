class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 2; j++) {
                
                if (j % 2 == 0) {
                   
                    if (nums[j] > nums[j + 2]) {
                        int t = nums[j];
                        nums[j] = nums[j + 2];
                        nums[j + 2] = t;
                    }
                } else {
                    if (nums[j] < nums[j + 2]) {
                        int t = nums[j];
                        nums[j] = nums[j + 2];
                        nums[j + 2] = t;
                    }
                }
                
            }
        }
        return nums;
    }
}