/* Structure of a Linked list Node
 class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node findIntersection(Node head1, Node head2) {
        // code here
        //edge case handler 
        if(head1==null || head2==null){
            return null;
        }
        
        Node curr1=head1;
        Node curr2=head2;
        Node head=null;
        Node curr=null;
        while(curr1!=null && curr2!=null){
            if(curr1.data==curr2.data){
            if(head==null){
                Node curr3= new Node(curr1.data);
                head=curr3;
                curr=curr3;
            } else{
                 Node curr3= new Node(curr1.data);
                curr.next=curr3;
                curr=curr3;
            }
            curr1=curr1.next;
            curr2=curr2.next;
            
            
            } else if (curr1.data<curr2.data){
                curr1=curr1.next;
            }else {
                curr2=curr2.next;
            }
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna