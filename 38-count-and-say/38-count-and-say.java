class Solution {
    public String countAndSay(int n) {
      if(n==1){
        return "1";
      }
      String res = countAndSay(n-1);
      int counter = 0;
      String s ="";
      for(int i =0; i<res.length(); i++){
        counter++;
        if(i==res.length()-1 || res.charAt(i) != res.charAt(i+1)){
          s = s+counter+res.charAt(i);
          counter =0;
        }
      }
        
    return s;}
}