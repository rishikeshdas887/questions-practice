/* Structure of a Linked List node
class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
} */

class Solution {
    public Node mergeSort(Node head) {
        // code here
        
        if(head==null || head.next==null){
            return head;
        }
        //make two pointers
        Node slow=head;
        Node fast=head;
        
        
        
        //middle of the linked list to be found by slow pointer 
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        //break the list into 2 halves -Divide
        Node mid =slow.next;
        slow.next=null;
        
        //recursizevly sort both halves 
        Node left=mergeSort(head);
        Node right=mergeSort(mid);
        
        
        return merge(left,right);
    }
    
    private Node merge(Node a , Node b){
        Node dummy=new Node(-1);
        Node tail=dummy; //tracks last node of merged list
        
        //comparing both a and b pointer 
        while(a!=null && b!=null){
            if(a.data<=b.data){
              tail.next=a;
              a=a.next;
            } else{
                tail.next=b;
                b=b.next;
            }
            
            //move the tail to next node eventually after each ( comparison + placing }
            tail=tail.next;
        }
        
        //if some nodes are remaining attach them as well 
        if(a!=null){
            tail.next=a;
              
        } else  {
            tail.next=b;
               
        }
        return dummy.next; //returning the head of the actual linked list
        
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna