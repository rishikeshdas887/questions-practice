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
    public boolean isPalindrome(ListNode head) {

       ListNode slow=head;
       ListNode fast=head;

       while( fast!=null && fast.next!=null ){
        slow=slow.next;   //fast agr valid hai and uska next wla valid h to slow definintely valid hoga
        fast=fast.next.next;
       }
//start reversing now 
       ListNode curr=slow;
       ListNode prev=null;

while(curr!=null){

 ListNode next=curr.next;
  
 curr.next=prev;  //curr k baad wla element ko prev se jodo taki total process khtm ho sake 
 prev=curr;
 curr=next;

    

}

//cheking palindrome or not
ListNode right=prev;
ListNode left=head;

while(right!=null){

    if(left.val!=right.val){
        return false;
    }
    left=left.next;
    right=right.next;

}
return true;
    

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna