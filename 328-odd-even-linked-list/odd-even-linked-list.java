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
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null || head.next==null){  //head kisi node ko point hi ni krega toh head.next error bhejega
    return head;
}
    ListNode odd =head;
    ListNode even=head.next;
    ListNode evenHead=even;  //making the start of the even head 



while(even!=null && even.next!=null){
    
    odd.next=even.next;
    odd=odd.next;

    even.next=odd.next;
    even=even.next;




}

odd.next=evenHead; //odd list ka end ko connect kr diye even list ka head se 
return head;
 

    






    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna