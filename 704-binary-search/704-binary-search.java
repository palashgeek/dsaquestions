class Solution {
    public int search(int[] nums, int target) {
    int start = 0;
      int end = nums.length-1;
      
        if (nums == null ||  nums.length == 0){
            return -1;
        }
         while(start <= end){
            int mid = (end-start)/2 + start;
            if(nums[mid] == target) return mid;
            if(nums[mid] < target) start = mid + 1;
            else end = mid  - 1;
	    }
        return -1;
    }
}