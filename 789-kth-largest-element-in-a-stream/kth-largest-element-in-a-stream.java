class KthLargest {

private int k; //private will be controlled by classes only 
private PriorityQueue<Integer> pq=new PriorityQueue<>();//private will be controlled by classes only 
    public KthLargest(int k, int nums[]) {
        this.k=k; //constructor 
      
        for(int num:nums){
            pq.add(num);
        

        if(pq.size()>k){
            pq.poll(); 
        }
        }
    }
    
    public int add(int val) { //so outside can call 
      pq.add(val);
      if(pq.size()>k){
        pq.poll();
      }
      return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna