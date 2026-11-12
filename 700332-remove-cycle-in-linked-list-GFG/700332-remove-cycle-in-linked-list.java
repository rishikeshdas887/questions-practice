/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
} */
class Solution {
    public static void removeLoop(Node head) {
        // code here
        //floyd's algorithm here 
        
        //1. empty list checking 
        if(head==null ){
            return ;
        }
        Node slow=head;
        Node fast=head;
        
        //2. detect the cycle
     while(fast!=null && fast.next!=null){
         slow=slow.next;
         fast=fast.next.next;
         
         if(slow==fast){
            break; //when slow and fast meet together at a point 
         }
         
     }
     //3. no cycle found 
     if(fast==null || fast.next==null){
         return ;
     }
     
     //finding cycle's starting point 
     Node ptr1=head;
     Node ptr2=slow;
     
     while(ptr1!=ptr2){
         ptr1=ptr1.next;
         ptr2=ptr2.next;
         
       
     }
     
     Node last=ptr1;
     //finding the last node of cycle
     while(last.next!=ptr1){
         last=last.next;
     }
     
     
     
     
     
     last.next=null; //we wil remove the cycle and pointer 2 will point towards null
     
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna