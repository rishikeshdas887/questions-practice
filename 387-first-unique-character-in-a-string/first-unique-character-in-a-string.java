class Solution {
    public int firstUniqChar(String s) {
             int n=s.length();

       //making a new array 
       int count[] = new int[26];

       //check the frequency of the characters that are appaearing the no.of time inside the string 
    for(int i =0 ; i <n ; i++){
      count[s.charAt(i)-'a']++;//counting the character's ascii value after deducting from 'a'
    }
   
   for(int i =0;i<n ; i++){
   
    if( count[s.charAt(i)-'a']==1){
        return i;
    }

   }
return -1;  
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna