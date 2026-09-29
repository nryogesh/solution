class Solution {
    public int smallestIndex(int[] nums) {
        int r, n, q;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            n = nums[i];
            while (n != 0) {
                r = n % 10;
                sum += r;
                n = n / 10;
            }

            if (sum == i)
                return i;
        }

        return -1;
    }
}