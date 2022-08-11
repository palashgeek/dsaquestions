class Solution {
    public int longestPalindrome(String s) {
      int ans =0;
      HashMap<Character,Integer> map = new HashMap<>();
      for(int i =0; i<s.length(); i++)
      {
        char c = s.charAt(i);
        if(map.containsKey(c))
        {
          map.put(c,map.get(c)+1);
          
        }
        else
        {
          map.put(c,1);
        }
      
      }
      
      boolean isFirstOdd = false;
      for(Character key : map.keySet()){
        if(map.get(key)%2 == 0){
          ans += map.get(key);
        }
        else{
          if(isFirstOdd == false){
            ans+=map.get(key);
            isFirstOdd = true;
          }
          else{
            ans += map.get(key)-1;        
          }
        }
      }   
    return ans;
    }
}