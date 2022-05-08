class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==0){
          return false; // zero never comes s output in power of two
        }
      if (n==1){    // 2^0 ==1
        return true;
      }
      if(n%2==0){         //if something is diviible by 2 then it may be in power of two 
        return isPowerOfTwo(n/2);    //so we have to again chec if it is again divisibe by two until we get 1 as outpur
      }
      else {
        return false;
    }
}
}