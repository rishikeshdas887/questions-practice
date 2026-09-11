class Solution {
    public boolean isIdealPermutation(int[] nums) {
            //key logic - kya koi global  inverison hai jo local nhi hai 
    //we have to get the index of a non-local globalvariable at (i+2) as 
    //(i+1) is the local variable position so start from i+2
    //so hum start kr rhe 
    int max=nums[0];

//nums.length-2 i ka valid range set kr k rakhta hai 

     for(int i=0 ; i < nums.length-2 ;i++){
    //abhi tk left side elemnts ka max mainatin kro nums[0] se bada max element
         max=Math.max(max,nums[i]);
         if(max>nums[i+2]){
         return false; //non-local global variable mila 
             }
     }

     return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna