class Solution {
    public String digitSum(String s, int k) {
        //for this we have to start our next group when s.length()>k

        while(s.length()>k){
            StringBuilder sb = new StringBuilder();

            for(int i =0 ; i < s.length() ; i +=k){
               int sum =0; //calculate each group's digit sum 
               //check where should the group's end 
               int end =Math.min(i+k,s.length());
               for(int j=i ; j <end ; j++){  //go through each character of each group 
            sum+=s.charAt(j)-'0'; // subtracting with zero to convert integer into character and adding all  numbers in a group one by one to make a total sum and save it as a whole like a chracter
               }
               sb.append(sum);
            }
        s=sb.toString();
        }
        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna