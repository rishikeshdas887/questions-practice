class Solution {
    public String reverseWords(String s) {
          //using split and java's built in string builder

      //splitting each array characters into a character array
       String words[]= s.split(" ");
     
            
        for(int i =words.length-1 ; i>=0 ; i--){
            
     StringBuilder sb= new StringBuilder(words[i]); //take every character that are splitted inside the words array 

            sb.reverse();//nothing inside the brackets , it reverses every character of a word

 //stroing the reverse order of characters back into their original places
            words[i]=sb.toString();
            //storing all characters together as they are already reversed 
          

        }
        String sentence= String.join(" ",words); //as promised we cannot directly send words as it is an array of characters so we have to make a variable string to store it and then return it  
         return sentence;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna