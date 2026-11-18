/* Structure of linked list Node
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
    public Node addOne(Node head) {
        // code here.
        
            // Step 1: Reverse the linked list
            head = reverse(head);

            // Step 2: Add 1
            Node curr = head;
            int carry = 1;

            while (curr != null && carry > 0) {

                int sum = curr.data + carry;

                curr.data = sum % 10;
                carry = sum / 10;

                if (curr.next == null && carry > 0) {
                    curr.next = new Node(carry);
                    carry = 0;
                }

                curr = curr.next;
            }

            // Step 3: Reverse back
            return reverse(head);
        }

        Node reverse(Node head) {

            Node prev = null;
            Node curr = head;

            while (curr != null) {

                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            return prev;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna