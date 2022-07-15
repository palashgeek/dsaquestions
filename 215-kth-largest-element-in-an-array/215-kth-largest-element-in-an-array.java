class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
      int n = nums.length;
      int s = nums[n-k];
      return s;
    }
}