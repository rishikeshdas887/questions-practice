class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
                int m=ransomNote.length();
        int n=magazine.length();
        //no edge cases because the characters and the frequency of repetitions 
        int count[]=new int[26];//making a new array of 26 integers initially


//first we have to count the characters in magazine 
      for(int i =0 ; i < n ; i ++){
        count[magazine.charAt(i)-'a']++;
      }
      for(int i=0; i <m ;i++){
             int index=ransomNote.charAt(i)-'a'; //to store index inside count array of current character
               count[index]--; //decrease the repititon of each character by one at a time 

               //repeat the process

                  if(count[index]< 0){
                    return false;
                  }
      }
   


return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna