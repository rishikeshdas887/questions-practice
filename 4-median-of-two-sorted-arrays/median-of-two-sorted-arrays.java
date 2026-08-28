class Solution {
    public double findMedianSortedArrays(int arr1[], int arr2[]) {
        int i=0; //for arr1
        int j =0; //for arr2
        int n1=arr1.length;
        int n2=arr2.length;
        ArrayList<Integer> list= new ArrayList<>();


      while(i<n1 && j< n2){
      if(arr1[i]<=arr2[j]){
        list.add(arr1[i]);
        i++;
      } else{
           list.add(arr2[j]); 
           j++;          // when arr[i]>arr[j];
      }
      }
  //if in case any element is left to be added 
  //if elemnt is from n so
  while(i<n1){
      list.add(arr1[i]);
      i++;
     }
while(j<n2){
    list.add(arr2[j]);
    j++;
}
      //check median is odd or even
if(list.size()%2==0){  //if even
    return (list.get(list.size()/2-1)+list.get(list.size()/2))/2.0;
}  //if odd
else{
    return list.get(list.size()/2);
}

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna