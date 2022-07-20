class Solution {
    public int maxSubArray(int[] nums) {
      
        int sum = 0;
      int max_sum = Integer.MIN_VALUE;
      int n = nums.length;
      for (int i = 0; i < n; i++){
        sum = sum + nums[i];
        max_sum = Math.max(sum, max_sum);
        if(sum<0){
sum = 0;
        }
      }
      return max_sum;
    }
}