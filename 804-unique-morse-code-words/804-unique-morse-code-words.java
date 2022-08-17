class Solution {
    public int uniqueMorseRepresentations(String[] words) {
  String[] arr = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
      Set<String> map = new HashSet<>();
      
      for(String word: words){
        StringBuilder str = new StringBuilder();
        for(char c: word.toCharArray()){
          int index = c - 'a';
          str.append(arr[index]);
          
        }
        map.add(str.toString());
      }
      return map.size();
    }
}