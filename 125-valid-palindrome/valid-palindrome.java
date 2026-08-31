class Solution {
    public boolean isPalindrome(String s) {
        
        String valid=s.toLowerCase();
  int left=0;
  int right=valid.length()-1;


 while(left<right){
   char charLeft=valid.charAt(left);
  char   charRight=valid.charAt(right);


    if(!Character.isLetterOrDigit(charLeft)){
        left++;
    }
     else if(!Character.isLetterOrDigit(charRight)){
        right--;
     }

     else{
        if(charLeft!=charRight){
    return false;
}

  
left++;
right--;
 }
 }
 return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna