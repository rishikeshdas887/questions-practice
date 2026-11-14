class Solution {
    public int sumOddLengthSubarrays(int arr[]) {
        
    int n =arr.length;
    int total=0;  //sum of all odd length sub arrays is counted 
  for(int i = 0 ; i < n ; i++){
    int sum=0;

for(int j =i ; j <n ; j++){
     sum=sum+ arr[j];

     int length=j-i+1;
     
     if(length % 2 !=0){
        total+=sum;
     }

}


  }

return total;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna