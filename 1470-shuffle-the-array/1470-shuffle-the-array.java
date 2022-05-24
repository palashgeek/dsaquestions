class Solution {
    public int[] shuffle(int[] nums, int n) {
      int[] res = new int[nums.length];
      int x = 0;
      for (int i = 0; i<nums.length; i ++){
        if (i % 2 == 0){
          res[i] = nums[x];
          x++;
        }
        else{
          res[i] = nums [x+n-1];
        }
      }
      return res;
        
    }
}
