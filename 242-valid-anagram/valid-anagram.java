class Solution {
    public boolean isAnagram(String s, String t) {
                int m = s.length();
         int n =t.length();
         if(m!=n){
            return false;
         }
         int count[]=new int[26];   //making a new array having 26 alphabets
         for(int i =0 ; i<m ;i++){
          count[s.charAt(i)-'a']++;// pehle jo char value ka ascii value h usse a ko minus kro index nikalo aur count ka value uss character k liye badha do 
        //  Find which letter s.charAt(i) is, go to that letter's slot, and decrease its count.
         }
         for(int i=0; i <n ; i++ ){
count[t.charAt(i)-'a']--;// index nikla hua h  aur count ka value uss character k liye minus krte rho 
//Find the count of every character and reduce it by 1. 
//Find which letter s.charAt(i) is, go to that letter's slot, and decrease its count.
         }
         //count array is made now and we have to check each elements count is 0 or not 
        for(int i =0; i<count.length;i++){
            if(count[i]!=0){  //chechk the value at position i if it is not zero
                return false;
            }
        }
      
return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna