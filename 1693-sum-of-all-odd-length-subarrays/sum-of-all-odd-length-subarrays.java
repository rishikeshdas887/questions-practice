class Solution {
    public int sumOddLengthSubarrays(int arr[]) {
        
    int n =arr.length;
  int total=0;  //sum of all odd length sub arrays is counted 
  for(int i = 0 ; i < n ; i++){
 
 //calculate L
int  L=i+1; //calculating the choices for starting position

//calculate R ,i.e the choices for the ending position
int R=n-i;

//calculate the count 

int count =(L*R+1)/2;  //in how many odd length sub arrays , a element occurs

total+=arr[i]*count;

}


  

return total;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna