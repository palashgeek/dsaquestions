class Solution {
    public int[] rearrangeArray(int[] nums) {
      int n = nums.length;
      int[] Po = new int[n/2];
      int p = 0;
      
      int[] Ne = new int[n/2];
      int ni = 0;
      
      for(int i = 0; i<n; i++){
        if(nums[i]>0){
          Po[p] = nums[i];
          p++;
        }
        else{
          Ne[ni] = nums[i];
          ni++;
        }
      }
      
      p = 0;
      ni = 0;
      for(int i = 0; i<n; i++){
       if(i%2==0){
       nums[i] = Po[p];
        p++;
       }
      else{
        nums[i] = Ne[ni];
        ni++;
      }
      }
        
   return nums; }
}