class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

    int n =nums.size();
    int minSum=Integer.MAX_VALUE;

    for(int size=l ; size<=r ;size++){
      int sum=0;

      //calclate the first window 
     for(int i=0 ; i < size ;i++){
         sum+=nums.get(i);
     }
     if(sum >0){
        minSum=Math.min(minSum,sum);
     }

     for(int i=size ; i< n ; i++){
        sum+=nums.get(i)-nums.get(i-size);
          if(sum > 0){
         minSum=Math.min(minSum,sum);
     }
   
     }
    }

    return minSum==Integer.MAX_VALUE ?-1 :minSum;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna