class Solution {
    public int numIdenticalPairs(int[] nums) {
      int count = 0;
      int i =0;
      int j =0;
      for (i =0; i<nums.length; i++){
       for (j =0; j<nums.length; j++){
      if (i<j && nums[i] == nums[j]){
        count ++;
      }
         
       }
        
      }
        return count;    
    }
}