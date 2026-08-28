class Solution {
    public int[] getConcatenation(int nums[]) {
        //joining the 1st array and 2n array together after one another 
    int n1 =nums.length;

    int ans[]=new int[2*n1]; //size and definiton of new array 
   
   for (int i =0 ; i < n1  ;i++)
 {
ans[i]=nums[i];

ans[i+n1]=nums[i];
                 }
                 return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna