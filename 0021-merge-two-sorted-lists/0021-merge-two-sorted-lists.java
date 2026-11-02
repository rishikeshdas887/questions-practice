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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //making a dummy and a tail node 
        ListNode dummy=new ListNode(-1); //extra temporary node 
        ListNode tail=dummy;  //tracks last node of ther merged List

        while(list1!=null && list2!=null){
          if(list1.val<=list2.val){
            tail.next=list1;
            list1=list1.next;
          }
          else{
            tail.next=list2;
            list2=list2.next;
          }
           tail=tail.next;
        }
    

    //appening the reaminig nodes of the lists
    if(list1!=null){
        tail.next=list1;

    }
    else{
        tail.next=list2;
    }
    return dummy.next; // dummy is -1 so we hvae to return the list starting from the first real/permanent node 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna