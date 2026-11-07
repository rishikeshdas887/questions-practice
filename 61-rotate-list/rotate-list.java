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
    public ListNode rotateRight(ListNode head, int k) {
        //edge case 
        if(head==null || head.next==null|| k ==0){
            return head;
        }
       
       //1.
       //initialize the end and the head pointer 
       ListNode tail=head;
        int len=1;
     
     //check the tail
     while(tail.next!=null){
        tail=tail.next;
        len++;
     }
     //2. reduce unnecessary rotations
     k=k%len; //to get the remainer no of rotaitons to be done
     if(k==0){
        return head;
     }

     //3.making the linked list circular 

     tail.next=head;

     //4.to check how much steps to move to find the new tail
     int steps =len-k-1;

 ListNode newTail=head;
     for(int i =0 ; i <steps; i++){   //moving the pointer to the next node until it reaches the steps
        newTail=newTail.next;
     }

//5.find new head
ListNode newHead=newTail.next;

//breaking the circle and returning the new linked list rotated by "K" times
//making node null by ourselves to break the circle
newTail.next=null;

return newHead;


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna