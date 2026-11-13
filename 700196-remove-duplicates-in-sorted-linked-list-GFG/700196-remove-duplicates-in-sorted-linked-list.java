/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // code here
        //the linked list is already sorted , we will be doing what is 
         
         Node curr=head;
         while(curr!=null && curr.next!=null){
             
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            } 
            else{
                curr=curr.next;
            }
             
             
             
             
         }
         return head;
         
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna