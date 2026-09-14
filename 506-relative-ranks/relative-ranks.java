class Solution {
    public String[] findRelativeRanks(int score[]) {
        int n=score.length;
      String s[]= new String[n];
      
PriorityQueue<int[]>pq=new PriorityQueue<>(
(a,b)-> b[0]-a[0]
);

for(int i=0 ; i <n;i++){
    pq.add(new int[]{score[i],i});
    
}
int rank=1;

while(!pq.isEmpty()){
    int curr[]=pq.poll();
    int index=curr[1];

    if(rank==1){
        s[index]="Gold Medal";
    }
    else if(rank==2){
        s[index]="Silver Medal";

    }
    else if(rank==3){
        s[index]="Bronze Medal";
    }
    else{
        s[index]=String.valueOf(rank);
    }
    rank++;

}
return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna