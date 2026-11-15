/*
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    public static Node moveToFront(Node head) {
        // code here
        Node prev=null;
        Node curr=head;
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        prev.next=null; //after traversing last node i.e curr.next has become null 
        curr.next=head;
        return curr;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna