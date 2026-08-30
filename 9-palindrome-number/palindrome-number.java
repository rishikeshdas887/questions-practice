class Solution {
    public boolean isPalindrome(int x) {
            int rev=0;
         int original=x; //because inside the loop x will change
if(x<0){
    return false;
}
        while(x!=0){
            int digits= x%10;//get the last number and store it 
            x=x/10;//remove the last number and store the rest

    rev =rev*10+digits;
    
        }
      
if(original==rev){
    return true;
}

return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna