/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class Solution {
    public Node removeDuplicates(Node head) {
        // code here
    //first come the edge case
    if(head==null || head.next==null){
        return head;
    }
    
    //2.we have to make a hashset
    HashSet<Integer> set=new HashSet<>();
    
    //3.then make the variables
    Node prev=head;
    Node curr=head.next;
    set.add(prev.data); //set={5,...}
    
    while(curr!=null){
        if(!set.contains(curr.data)){
            set.add(curr.data);
            prev.next=curr;
            prev=curr;
            curr=curr.next;
            
        }
        else{
            curr=curr.next;
        }
    }
    prev.next=null;
    
    return head;
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna