class Solution {
    public boolean validPalindrome(String s) {
             int left=0;
     int right=s.length()-1;

  while(left<right){


    if(s.charAt(left)==s.charAt(right)){
        left++;
        right--;
    } else{
        return isPalindrome(s,left+1,right)|| isPalindrome(s,left,right-1);
        //decide which pointer to move forward(left) or backward(right) using a helper method and decide then using private class to inside this solution after moving the chiosen pointer to check is palindrome or not
    }

  }
  return true;

    }


    private boolean isPalindrome(String s,int left, int right){

        while(left<right){

           if(s.charAt(left)!=s.charAt(right)){
            return false;
           } else{
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