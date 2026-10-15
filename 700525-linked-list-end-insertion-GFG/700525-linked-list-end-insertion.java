/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node newNode = new Node(x);  //making a new ndoe to insert the value 
                 if(head==null){
                        return newNode; //if list is empty then newNode becomes first node 
                    }

                 Node temp=head; //to not change head again in the list storing it inside a temp var

                 while(temp.next!=null){
                      temp= temp.next;
                   }

                  temp.next=newNode; //connecting last node next with 
                  return head;  //returning original refernce head

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna