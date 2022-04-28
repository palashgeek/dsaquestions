class Solution {
    public String restoreString(String s, int[] indices) {

        int n = s.length();
        char[] arr = new char[n];
        for (int i = 0; i<n; i++){            //o,1,2,3,4,5,6,7  3rd sorted manner mai line se jmm jayega sb//
            arr[indices[i]] = s.charAt(i);   //{4,5,6,7,0,2,1,3} 2nd yeh index uppr vaale mai sorted trike se h//
                                             //"codeleet"        1st yeh word uppr vaale index pr h //
        }
        return new String(arr);
    }
}