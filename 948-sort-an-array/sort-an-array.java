class Solution {
    public int[] sortArray(int arr[]) {
  mergeSort(arr, 0,arr.length-1);
  return arr;
         
      
    }


void mergeSort(int arr[] , int start,int end ){

if(start>=end)return ;

      int mid= start+(end-start)/2;
        //divinding array into two parts
       mergeSort(arr,start,mid);

       mergeSort(arr,mid+1,end);

       //merging both the arrays
       merge(arr,start,mid,end);

}


 void merge(int arr[] , int start,int mid,int end ) {
int leftArrLen=mid-start+1;
int rightArrLen=end-mid;
int leftArr[]=new int[leftArrLen];
int rightArr[]=new int[rightArrLen];

//taking all elements from the left Array from the main array and placing elements according to it 
int k =start;
for(int i =0 ;i< leftArrLen ; i++){
leftArr[i]=arr[k];
k++;

}

k=mid+1;
for(int j=0 ; j<rightArrLen;j++){
    rightArr[j]=arr[k];
    k++;
}

//merge sort's exact logic
int j =0;
int i =0;
k =start;
while(i<leftArrLen && j <rightArrLen ){
    if(leftArr[i]<=rightArr[j]){
        arr[k]=leftArr[i];
        k++;
        i++;
    }else{
    arr[k]=rightArr[j];
    k++;
    j++;
    }
}

//edge case handling 
while(i<leftArrLen){
    arr[k]=leftArr[i];
    k++;
    i++;
}
while(j<rightArrLen){
    arr[k]=rightArr[j];
    k++;
    j++;
}

 }


}