class Solution {
    public int[] buildArray(int nums[]) {
        int n =nums.length;
       int ans[]= new int[n];
        for(int i =0 ; i <n ; i++){
              ans[i] = nums[nums[i]]; // ans should store sequence wise arrays 
              
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna