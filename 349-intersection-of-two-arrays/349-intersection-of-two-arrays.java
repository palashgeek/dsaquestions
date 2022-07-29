class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
      int m = nums2.length;
      ArrayList <Integer> list = new ArrayList<>();
      for(int i=0; i<n; i++){
        for(int j =0; j<m; j++){
          if(nums1[i] == nums2[j]){
          if(list.contains(nums1[i])==false){
            list.add(nums1[i]);
            break;
          }
          }
        }
      }
      int[] ans = new int[list.size()];
      for (int k = 0; k<list.size(); k++ ){
ans[k] = list.get(k);}
    return ans; }
}