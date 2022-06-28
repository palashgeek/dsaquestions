/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
      
      int decimal = 0;
      int length = 0; //initially length of a linked list is also zero
      ListNode node = head; // ek reference variable ko head ke barabr asign kiya yeh traverse hogA pure mai or head apni jgh hi rhega bss
      
      while(node.next != null){
        node = node.next;
        length++;
      }
      
      node = head;
    while(node.next != null){
    decimal += (node.val*(int)Math.pow(2,length));
      node = node.next;
      length--;
    } 
      decimal += (node.val*(int)Math.pow(2,0));
      return decimal;  
    }
}