// lc link: https://leetcode.com/problems/move-zeroes/description/

class Solution {
    public void moveZeroes(int[] nums) {
      int j = 0;
for (int i = 0; i < nums.length; i++) {
    if (nums[i] != 0) {
        int temp = nums[j];  // Store nums[j] in temp
        nums[j] = nums[i];   // Move non-zero number forward
        nums[i] = temp;      // Put zero in the old position
        j++;                 // Move j forward
    }
}
    }
}
