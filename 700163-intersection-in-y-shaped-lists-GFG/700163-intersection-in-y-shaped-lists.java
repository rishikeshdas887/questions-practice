/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node pointer1=head1;
        Node pointer2=head2;
        
        
        while(pointer1!=pointer2){
            
           if(pointer1==null){
               pointer1=head2;
           }else{
               pointer1=pointer1.next;
           }
           
           if(pointer2==null){
               pointer2=head1;
           }
           
           else{
               pointer2=pointer2.next;
           }
        }
        return pointer1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna