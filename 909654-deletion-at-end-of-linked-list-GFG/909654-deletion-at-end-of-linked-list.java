/* Linked List Node Structure
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node removeLastNode(Node head) {
        // code here
        if(head==null){
            return null;   //nohing to return in the list as head is not there i.e no nodes in the list
        }
        
        if(head.next==null){   //there is only head node and no nodes theereafter
        return null;
        }
        Node temp=head;
        
        while(temp.next.next!=null){  //second last node par rukna hai
            temp=temp.next;
        }
        
        temp.next=null;  //last node kon list se hi disconnect kr do 
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna