/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        // code here
        
        //1. check the LL is empty or not 
        if(head==null){
            return -1;
            
        }
        
        //2. check the linked list  for loop/cycle detection 
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast){
                break ;  //cycle is found 
            }
            
        }
        
        //if no cycle is there
        
        if(fast==null || fast.next ==null){
            return -1;
        }
        
    //find the starting node
    
    Node ptr1=head;
    Node ptr2=slow;
    
    while(ptr1!=ptr2){
        ptr1=ptr1.next;
        ptr2=ptr2.next;
        
       
    }
    
    return ptr1.data;
    
    
    
    
    
    
   }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna