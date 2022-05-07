class Solution {
    public int search(int[] nums, int target) {
        
		// Corner case
        if(nums == null || nums.length == 0) return -1;
        
        int low = 0;
        int high = nums.length-1;
        
        while(low <= high){
            int mid = (high-low)/2 + low;
            if(nums[mid] == target) return mid;
            if(nums[mid] < target) low = mid + 1;
            else high = mid  - 1;
	    }
        return -1;
    }
}