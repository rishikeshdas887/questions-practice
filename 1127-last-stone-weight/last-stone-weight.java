class Solution {
    public int lastStoneWeight(int[] stones) {
                
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

//adding elements
for(int stone:stones){
    pq.add(stone);
}


while(pq.size()>1){ //going until one step greater than 1 so that maintained
//picking two heaviest stones
int y=pq.poll();
int x=pq.poll();

//checking if they are equal
    if(x!=y){
    pq.add(y-x);//heaviest- second heaviest and adding 
    }

}

return pq.isEmpty() ? 0:pq.poll();

//O(nlog n )because each stone adding will take place so N times and adding one stone takes 0(logN) time
//space complexity will be O(N) because extra space is needed for stroing all N no.of Stones
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna