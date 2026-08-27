class Solution {
    public int minSubArrayLen(int target, int arr[]) {
        int n =arr.length;
        int left=0;
     int sum=0;
        int minLength=Integer.MAX_VALUE;

        for(int right=0 ; right< n ; right++){
           sum=sum+arr[right];
            while(sum>=target){
          //calculate the length of the window /subarray
      int length = right - left+1;  //right(last index h subarray)-left(first indexof subarray)
      //+1 (taki hamesha aage badh sake first index ka position )
      minLength= Math.min(length , minLength); //minlength ko update krna hai 
           

         //window ka length ko  chota krna hai 
         sum =sum-arr[left];  //left ka element ko hata do aur naya left pointer banao left ko aage badha ke 
    left++; //pointer left aage jayega 
            }


        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength ;
    }
}