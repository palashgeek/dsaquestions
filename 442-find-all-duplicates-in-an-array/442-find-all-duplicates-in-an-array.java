class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> al = new ArrayList<>();
      if(nums.length ==1){
        return al;
      }      
      //hashmap for storing the vlaue
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
          if(!map.containsKey(nums[i])){
            map.put(nums[i],1);
          }
          else{
            map.put(nums[i],map.get(nums[i])+1);
            
          }
        }
          
          for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int val = e.getValue();
            if(val>1){
              int key = e.getKey();
              Integer i = new Integer(key);
              al.add(i);
            }
          }
          
       return al; }
      }
    