class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;  // Initialize maxSum to the smallest possible value
        int curr = 0;  // To store the sum of the current subarray

        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            curr = Math.max(curr + nums[i], nums[i]);
            maxSum = Math.max(curr,maxSum);

        }
                    return maxSum;


        }
    
}
