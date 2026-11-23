/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        //creates a min -heap that currently compares the value of the nodes 
        PriorityQueue<ListNode> minHeap=new PriorityQueue<>((a,b)->a.val - b.val);


        //we are taking the head of all the empty lits 
        for(ListNode head :lists){
            if(head!=null){
                minHeap.add(head);
            }
        }

        //we are keep arranging the smallest node and pulling its next node 
         ListNode dummy = new ListNode(0);
         ListNode current =dummy;

         while(!minHeap.isEmpty()){
            ListNode smallest=minHeap.poll();  //get smallest node 
            current.next=smallest;  //take the smallest as the current 
            current=current.next;

         if(smallest.next!=null){ //if some nodes are sti left to be inserted ,simply insert them
           minHeap.add(smallest.next); //add the rest nodes 
         }
    }
       return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna