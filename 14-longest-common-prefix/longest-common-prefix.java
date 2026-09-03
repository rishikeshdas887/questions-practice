class Solution {
    public String longestCommonPrefix(String[] strs) {
          int minLength=strs[0].length(); //commong prefoc ca't be bigger than the word with minLength
       for (int i =0 ; i<strs.length; i++){ // am finding the words with minimum length 
            minLength=Math.min(strs[i].length(), minLength);
       }

       //in the 1st loop we gonna traverse through each character of wahc word inside the strs
        for(int i =0; i < minLength; i++){
            for (int j =0 ; j < strs.length;j++){ //the j is basically checking each word 
                if(strs[j].charAt(i)!=strs[0].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }

   return strs[0].substring(0,minLength); //return from the beginning to the length of the shortest word 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna