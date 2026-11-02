class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> visited = new HashMap<>();
        int rem;
        for (int i=0; i<nums.length; i++) {
            rem = target - nums[i];
            if (visited.containsKey(rem)) {
                return new int[]{visited.get(rem), i};
            }
            visited.put(nums[i], i);
        }
        return new int[0];
    }
}
