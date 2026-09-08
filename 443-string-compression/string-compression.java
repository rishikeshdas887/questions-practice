class Solution {
    public int compress(char[] chars) {
             int write=0; //write will count the length of each character group and in final tells the actual length pof compressed array
        int read=0;

      while(read<chars.length){
           char current=chars[read];
           int count=0;

           while(read<chars.length && chars[read]==current){
            count++;
            read++;
           }

           //tocount how many time one character is repeated consecutively 
           chars[write++]=current; //wr


if(count>1){
//changing the integer value of the count for a character into string value
     String countChar=String.valueOf(count);

     for(char c:countChar.toCharArray())
      chars[write++]=c;
}

      }
      return write;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna