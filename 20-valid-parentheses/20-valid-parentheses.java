class Solution {
    public boolean isValid(String s) {
      Stack<Character> st = new Stack<>();
        for(int i =0;i<s.length(); i++)
        {
          char x = s.charAt(i);
          if(st.isEmpty())
          {
            st.push(x);
          }  
          else if( (st.peek() == '{' && x == '}') || (st.peek() == '(' && x == ')') || (st.peek() == '[' && x == ']') )
          {
            st.pop();
          }
            else
            {
              st.push(x);
            }   
        }
      
      if(st.isEmpty())
      {
        return true;
      }
      else{
        return false;
      }
      
    }
}