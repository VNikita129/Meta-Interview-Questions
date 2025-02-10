//lc link 
// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
       HashMap<Integer, Integer> map1 = new HashMap<>();

       for (int i=0; i< nums.length;i++)
       {
         int complement = target - nums[i];

         if (map1.containsKey((complement)))
         {
            return new int[] { map1.get(complement),i};
         }

         map1.put(nums[i],i);
       }
       return new int [] {};
    }
}
