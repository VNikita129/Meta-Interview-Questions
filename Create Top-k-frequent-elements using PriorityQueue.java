class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> hash = new HashMap<>();
        // Step 1: Count the frequency of each element using a HashMap

        for(int k1 =0;k1< nums.length; k1++)
        {
            hash.put(nums[k1],hash.getOrDefault(nums[k1],0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> max = 
        new PriorityQueue <> ((a,b) -> b.getValue()-a.getValue());

        max.addAll(hash.entrySet());

       int [] res = new int[k];

        for (int i =0; i< k; i++)
        {
           res[i] = Objects.requireNonNull(head.poll()).getKey();
        }

         return res;
    }
}
