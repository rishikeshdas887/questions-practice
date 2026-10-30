/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/

class Solution {
    public Node reverseKGroup(Node head, int k) {

    //base case
     if(head==null){
         return null;
     }
     //so now we have to check and reverse the k no . of elements
     Node prev=null;
    Node curr=head;

    for(int i=0 ; i < k && curr!=null ; i++){
      Node forward = curr.next;

        curr.next=prev;
        prev=curr;
        curr=forward;

    }

    //reamining list has to be sorted using recursion 
    Node reversedKAns=reverseKGroup(curr , k);

    //join both the list 
    head.next = reversedKAns;

    return prev;


    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna