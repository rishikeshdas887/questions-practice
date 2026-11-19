/*
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
    public Node addTwoLists(Node head1, Node head2) {
        
        //reverse the list 1 
        head1=reverse(head1);
        
        //reverse list 2
        head2=reverse(head2);
        
        //addition logic remains here
        Node curr1=head1;
        Node curr2=head2;
        int carry=0;
        
        Node dummy=new Node(0);
        Node tail=dummy;
        
        //ege case handling 
   
        while(curr1!=null || curr2!=null ||carry!=0){
            
                 //some carry after previous additions is still left to be added to the current digits
        int sum=carry;
          if (curr1 != null) {
              sum += curr1.data;
          }

          if (curr2 != null) {
              sum += curr2.data;
          }
           
           
           //from the sum extract digit and carry
          int  digit=sum%10;
           carry=sum/10;
           
           //make a newNode 
           
           tail.next=new Node(digit);  //creates new connection
           tail=tail.next; //moves tail from dummy node to new Node just created 
           
           if(curr1!=null){
               curr1=curr1.next;
           }
           if(curr2!=null){
               curr2=curr2.next;
           }  //move both pointers forward 
           
           
           
           
          
        }
        
        Node result=reverse(dummy.next);  //we are reversing the final result because at first in static method we reversed it and started operations 
           while(result!=null && result.data==0 && result.next!=null){
               result=result.next;
           }
            return result;
           
        
        
    }
        // code here
        // the linked list should move forward according to digits in node so reverse both the linked list
        
        //1.Reverse linked list 1
       private  static Node reverse(Node head){
            Node prev=null;
            Node curr=head;
            
            while(curr!=null){
               Node nextNode=curr.next; //to do not forget the remaining nodes of linked list -pipelining concept
               
               curr.next=prev;//reversed part curr.next points to  like 2->1->null
               prev=curr;
               curr=nextNode;
               
            }
            
            return prev;
        }
     
        
        
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna