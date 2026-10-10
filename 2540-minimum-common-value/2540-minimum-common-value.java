class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0; // Pointer for nums1
        int j = 0; // Pointer for nums2
        
        // Loop until one of the pointers runs out of bounds
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i]; // Found the minimum common value
            } else if (nums1[i] < nums2[j]) {
                i++; // Move nums1 pointer forward to look for a larger number
            } else {
                j++; // Move nums2 pointer forward to look for a larger number
            }
        }
        
        return -1; // No common element found
    }
}
