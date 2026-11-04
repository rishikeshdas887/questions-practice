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
    public void reorderList(ListNode head) {
 

 //found the middle of the linked list 
    ListNode slow=head;
    ListNode fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }    
//Reverse the right part from the  middle of the linked list 

ListNode curr=slow.next; // q ki slow middle node hai 
slow.next=null; //ek badi linked list ko 2 parts mein tod diya middle element k baad null h abb 
ListNode prev=null;

while(curr!=null){
ListNode next=curr.next;
curr.next=prev;
prev=curr;
curr=next;
}

//now we have  1 -> 2-> 3-> null and 5-> 4-> null

//we gonna make 1 → 5 → 2 → 4 → 3

//now prev is at 5 and head is at 1
ListNode first=head;
ListNode second =prev;
while(second!=null){
ListNode temp1=first.next; //temp is used to store values of next consecutive nodes 
ListNode temp2=second.next;

//change connections 
first.next=second;
second.next=temp1; 

//
first=temp1;
second=temp2;



}



    

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna